import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

 class FS {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        return hasNextByte() ? buffer[ptr++] : -1;
    }

    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}
public class Main {
    static TreeNode[] tr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
       FS fs = new FS();
        int n = fs.nextInt();
        tr = new TreeNode[n];
        int p[] = new int[n];
        for (int i = 0; i < n; i++) {
            int id = fs.nextInt();
            int left = fs.nextInt();
            int right = fs.nextInt();
           if (left!=-1)p[left]=id+1;
            if (right!=-1) p[right]=id+1;
            tr[i] = new TreeNode(id, left, right);
        }
        Arrays.sort(tr);
        int par=0;
        while (p[par]!=0){
            par=p[par]-1;
        }
        sb.append("Preorder\n");
        preorder(par);
        sb.append("\nInorder\n");
        inorder(par);
        sb.append("\nPostorder\n");
        postorder(par);
        System.out.println(sb);
    }

    private static void preorder(int node) {
        if (node == -1) return;
        sb.append(" ").append(node);
        preorder(tr[node].left);
        preorder(tr[node].right);
    }

    private static void inorder(int node) {
        if (node == -1) return;
        inorder(tr[node].left);
        sb.append(" ").append(node);
        inorder(tr[node].right);
    }

    private static void postorder(int node) {
        if (node == -1) return;
        postorder(tr[node].left);
        postorder(tr[node].right);
        sb.append(" ").append(node);
    }

    static class TreeNode implements Comparable<TreeNode> {
        int id;
        int left;
        int right;

        public TreeNode(int id, int left, int right) {
            this.id = id;
            this.left = left;
            this.right = right;
        }

        @Override
        public int compareTo(TreeNode o) {
            if (this.id > o.id) return 1;
            return -1;
        }
    }
}
