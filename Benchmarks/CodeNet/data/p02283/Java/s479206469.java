import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        Node root = null;
        
        while (n-- > 0) {
            String op = input.next();
            if ("insert".equals(op)) {
                Node node = new Node(input.nextInt());
                root = insertTree(root, node);
            } else if("print".equals(op)) {
                System.out.println(inorder(root));
                System.out.println(preorder(root));
            }
        }
    }
    
    private String preorder(Node node) {
        StringBuilder sb = new StringBuilder();
        sb.append(' ').append(node.getId());
        if (node.hasLeft()) sb.append(preorder(node.getLeft()));
        if (node.hasRight()) sb.append(preorder(node.getRight()));
        return sb.toString();
    }
    private String inorder(Node node) {
        StringBuilder sb = new StringBuilder();
        if (node.hasLeft()) sb.append(inorder(node.getLeft()));
        sb.append(' ').append(node.getId());
        if (node.hasRight()) sb.append(inorder(node.getRight()));
        return sb.toString();
    }
    private String postorder(Node node) {
        StringBuilder sb = new StringBuilder();
        if (node.hasLeft()) sb.append(postorder(node.getLeft()));
        if (node.hasRight()) sb.append(postorder(node.getRight()));
        sb.append(' ').append(node.getId());
        return sb.toString();
    }
    
    Node insertTree(Node root, Node z) {
        Node x = root;
        Node y = null;
        while (x != null) {
            y = x;
            if (z.getId() < x.getId()) {
                x = x.getLeft();
            } else {
                x = x.getRight();
            }
        }
        if (y == null) {
            root = z;
        } else {
            if (z.getId() < y.getId()) {
                y.setLeft(z);
            } else {
                y.setRight(z);
            }
        }
        return root;
    }
    
    private static class Node {
        int id;
        Node left = null;
        Node right = null;
        
        Node(int id) {
            this.id = id;
        }
        int getId() {
            return id;
        }
        Node getLeft() {
            return left;
        }
        void setLeft(Node left) {
            this.left = left;
        }
        boolean hasLeft() {
            return left != null;
        }
        Node getRight() {
            return right;
        }
        void setRight(Node right) {
            this.right = right;
        }
        boolean hasRight() {
            return right != null;
        }
    }
    
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
    
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
        
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
        
        public String next() {
            nextToken();
            return st.sval;
        }
        
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
        
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}