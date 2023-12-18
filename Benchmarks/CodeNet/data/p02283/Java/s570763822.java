import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Node {
    int id;
    Node left;
    Node right;
}

class Main {
    static Node root;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            if (command.charAt(0) == 'i') {
                int id = sc.nextInt();
                insert(id);
            } else if (command.charAt(0) == 'p') {
                System.out.println(inParse(root));
                System.out.println(preParse(root));
            } else if (command.charAt(0) == 'f') {
                int id = sc.nextInt();
                System.out.println(find(id));
            }
        }
    }

    public static void insert(int id) {
        Node insertedNode = new Node();
        insertedNode.id = id;

        if (root == null) {
            root = insertedNode;
            return;
        }

        Node node = root;
        while(true) {
            if (id < node.id) {
                if (node.left == null) {
                    node.left = insertedNode;
                    return;
                }
                node = node.left;
            } else {
                if (node.right == null) {
                    node.right = insertedNode;
                    return;
                }
                node = node.right;
            }
        }
    }

    public static String find(int id) {
        Node node = root;
        while(true) {
            if (node == null) {
                return "no";
            } else if (id == node.id) {
                return "yes";
            }

            if (id < node.id) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    public static String preParse(Node node) {
        if (node == null) {
            return "";
        }
        return " " + node.id + preParse(node.left) + preParse(node.right);
    }

    public static String inParse(Node node) {
        if (node == null) {
            return "";
        }
        return inParse(node.left) + " " + node.id + inParse(node.right);
    }
}

