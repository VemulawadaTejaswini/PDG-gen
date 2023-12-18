import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main implements Runnable {
    public static void main(String[] args) {
        new Thread(null,new Main(), "" ,Runtime.getRuntime().maxMemory()).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, List<Integer>> rootMap = new HashMap<>();
        for(int i = 0;i < m;i++) {
            Integer a = sc.nextInt() - 1;
            Integer b = sc.nextInt() - 1;
            List<Integer> root = rootMap.get(a);
            if(root == null) {
                root = new ArrayList<>();
                root.add(b);
            }
            else {
                root.add(b);
            }
            rootMap.put(a, root);
            root = rootMap.get(b);
            if(root == null) {
                root = new ArrayList<>();
                root.add(a);
            }
            else {
                root.add(a);
            }
            rootMap.put(b, root);
        }

        Map<Integer, Integer> resultMap = new HashMap<>();
        List<Integer> footprints = new ArrayList<>();
        Queue<Integer> que = new ArrayDeque<>();
        que.offer(Integer.valueOf(0));
        while(!que.isEmpty()) {
            Integer room = que.poll();
            List<Integer> root = rootMap.get(room);
            for(Integer next : root) {
                if(footprints.contains(next))continue;
                que.offer(next);
                resultMap.put(next, room);
                footprints.add(next);
            }
        }

        System.out.println("Yes");
        for(int i = 1;i < n;i++) {
            System.out.println(resultMap.get(Integer.valueOf(i)) + 1);
        }
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}