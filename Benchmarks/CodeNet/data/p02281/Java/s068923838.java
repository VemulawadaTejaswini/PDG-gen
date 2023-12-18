import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        Node[] nodes = new Node[n];
        for(int i = 0; i < n; i++) {
            nodes[i] = new Node(i);
        }
        
        for(int i = 0; i < n; i++) {
            int id = s.nextInt();
            Node node = nodes[id];
            int left = s.nextInt();
            if(left != -1) {
                node.setLeft(nodes[left]);
            }
            int right = s.nextInt();
            if(right != -1) {
                node.setRight(nodes[right]);
            }
        }
        
        Node root = null;
        for(int i = 0; i < n; i++) {
            if(nodes[i].getParent() == null) {
                root = nodes[i];
                break;
            }
        }
        
        System.out.println("Preorder");
        root.accept(new PreOrderVisitor());
        System.out.println();
        
        System.out.println("Inorder");
        root.accept(new InOrderVisitor());
        System.out.println();
        
        System.out.println("Postorder");
        root.accept(new PostOrderVisitor());
        System.out.println();
    }
    
    private static class Node {
        private int id;
        private Node parent;
        private Node left;
        private Node right;
        
        public Node(int id) {
            this.id = id;
        }
        
        public int getId() {
            return id;
        }
        
        public Node getParent() {
            return parent;
        }
        
        public Node getLeft() {
            return left;
        }
        
        public Node getRight() {
            return right;
        }
        
        public void setParent(Node parent) {
            this.parent = parent;
        }
        
        public void setLeft(Node left) {
            this.left = left;
            left.setParent(this);
        }
        
        public void setRight(Node right) {
            this.right = right;
            right.setParent(this);
        }
        
        public void accept(Visitor v) {
            v.visit(this);
        }
    }
    
    private abstract static class Visitor {
        public abstract void visit(Node n);
    }
    
    private static class PreOrderVisitor extends Visitor {
        @Override
        public void visit(Node n) {
            System.out.print(" ");
            System.out.print(n.getId());
            
            Node left = n.getLeft();
            if(left != null) {
                left.accept(this);
            }
            
            Node right = n.getRight();
            if(right != null) {
                right.accept(this);
            }
        }
    }
    
    private static class InOrderVisitor extends Visitor {
        @Override
        public void visit(Node n) {
            Node left = n.getLeft();
            if(left != null) {
                left.accept(this);
            }
            
            System.out.print(" ");
            System.out.print(n.getId());
            
            Node right = n.getRight();
            if(right != null) {
                right.accept(this);
            }
        }
    }
    
    private static class PostOrderVisitor extends Visitor {
        @Override
        public void visit(Node n) {
            Node left = n.getLeft();
            if(left != null) {
                left.accept(this);
            }
            
            Node right = n.getRight();
            if(right != null) {
                right.accept(this);
            }
            
            System.out.print(" ");
            System.out.print(n.getId());
        }
    }
}