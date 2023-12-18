import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BinTree tree = new BinTree();
		int n = Integer.parseInt(br.readLine());

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			if (line.startsWith("insert"))
				tree.add(Integer.parseInt(line.substring(line.indexOf(" ")+1)),0);
			else
				tree.print();
		}
	}
}

class BinTree {

    class Node {
        private int key;
        private int data;
        private Node left;
        private Node right;

        Node(int key,int data,Node left,Node right) {
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        int getKey(){
            return this.key;
        }

        int getValue(){
            return this.data;
        }

        void print(){
            System.out.println(this.data);
        }
    }

    private Node root;

    public BinTree(){
        this.root = null;
    }

    public int search(int key){
        Node p = root;

        while (true) {
            int cond = key - p.getKey();
            if (cond == 0)
                return p.getValue();
            else if (cond < 0)
                p = p.left;
            else
                p =p.right;
        }
    }

    private void addNode(Node node,int key,int data){
        int cond = key - node.getKey();
        if (cond == 0){
            return;
        }else if(cond < 0) {
            if (node.left == null)
                node.left = new Node(key,data,null,null);
            else
                addNode(node.left,key,data);
        }else{
            if (node.right == null)
                node.right = new Node(key,data,null,null);
            else
                addNode(node.right,key,data);   
        }
    }

    public void add(int key,int data){
        if (root == null)
            root = new Node(key,data,null,null);
        else
            addNode(root,key,data);
    }

    public boolean remove(int key){
        Node p = root;
        Node parent = null;
        boolean isLeftChild = true;

        while (true) {
            if (p == null)
                return false;
            int cond = key - p.getKey();
            if (cond == 0) {
                break;
            }else {
                parent = p;
                if (cond < 0) {
                    isLeftChild = true;
                    p = p.left;
                }else {
                    isLeftChild = false;
                    p = p.right;
                }
            }
        }

        if (p.left == null) {
            if (p == root)
                root = p.right;
            else if(isLeftChild)
                parent.left = p.right;
            else
                parent.right = p.right;
        }else if (p.right == null) {
            if (p == root)
                root = p.left;
            else if(isLeftChild)
                parent.left = p.left;
            else
                parent.right = p.left;
        }else {
            parent = p;
            Node left = p.left;
            isLeftChild = true;
            while (left.right != null) {
                parent = left;
                left = left.right;
                isLeftChild = false;
            }
            p.key = left.key;
            p.data = left.data;
            if (isLeftChild)
                parent.left = left.left;
            else
                parent.right = left.left;
        }
        return true;
    }

    public void printIn(Node node){
        if (node != null) {
            printIn(node.left);
            System.out.print(" "+node.key);
            printIn(node.right);
        }
    }

    public void printPre(Node node){
        if (node != null) {
            System.out.print(" "+node.key);
            printPre(node.left);
            printPre(node.right);
        }
    }

    public void print(){
        printIn(root);
        System.out.println();
        printPre(root);
        System.out.println();
    }
}