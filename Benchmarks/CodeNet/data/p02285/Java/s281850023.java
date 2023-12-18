
import java.util.Scanner;

class NodeRef{
    Node node;
}

enum Color{
    RED,
    BLACK
}

class Node{
    Node left;
    Node right;
    Node next;
    int data;
    int lis;
    int height;
    int size;
    Color color;

    public static Node newNode(int data){
        Node n = new Node();
        n.left = null;
        n.right = null;
        n.data = data;
        n.lis = -1;
        n.height = 1;
        n.size = 1;
        n.color = Color.RED;
        return n;
    }
}

// BST
public class Main {
    public Node addNode(int data, Node head){
        Node tempHead = head;
        Node n = Node.newNode(data);
        if(head == null){
            head = n;
            return head;
        }
        Node prev = null;
        while(head != null){
            prev = head;
            if(head.data < data){
                head = head.right;
            }else{
                head = head.left;
            }
        }
        if(prev.data < data){
            prev.right = n;
        }else{
            prev.left = n;
        }
        return tempHead;
    }

    class IntegerRef{
        int height;
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight  = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void preOrder(Node node) {
        if(node != null) {
            System.out.print(" " + node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void inOrder(Node node) {
        if(node != null) {
            inOrder(node.left);
            System.out.print(" " + node.data);
            inOrder(node.right);
        }
    }

    public Node search(Node root, int key){
        if(root == null){
            return null;
        }
        if(root.data == key){
            return root;
        }else if(root.data < key){
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }
    }

    public Node delete(Node root, int key) {
        if(root == null) {
            return root;
        } else if(key < root.data) {
            root.left = delete(root.left, key);
        } else if(key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // case1
            if(root.left == null && root.right == null) {
                root = null;
            }
            // case2
            else if(root.left == null) {
                Node tmp = root;
                root = root.right;
                tmp = null;
            } else if(root.right == null) {
                Node tmp = root;
                root = root.left;
                tmp = null;
            }
            // case3
            else {
                Node tmp = findMin(root.right);
                root.data = tmp.data;
                root.right = delete(root.right, tmp.data);
            }
        }
        return root;
    }

    public Node findMin(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        int key;

        Node head = null;
        Main bt = new Main();
        for(int i = 0; i < n; i++) {
            s = sc.next();
            if(s.equals("insert")){
                key = sc.nextInt();
                head = bt.addNode(key, head);
            } else if(s.equals("print")) {
                inOrder(head);
                System.out.println();
                preOrder(head);
                System.out.println();
            } else if(s.equals("find")) {
                key = sc.nextInt();
                Node t = bt.search(head, key);
                if(t != null) {
                    System.out.print("yes\n");
                } else {
                    System.out.print("no\n");
                }
            } else if(s.equals("delete")) {
                key = sc.nextInt();
                bt.delete(head, key);
            }
        }
    }
}

