import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NodeList node = new NodeList();
        int n = Integer.parseInt(scan.next());
        int x;
        for(int i=0; i<n; i++) {
            switch (scan.next()) {
                case "insert":
                    node.Insert(Integer.parseInt(scan.next()));
                    break;
                case "delete":
                    node.SearchDelete(Integer.parseInt(scan.next()));
                    break;
                case "deleteFirst":
                    node.DeleteFirst();
                    break;
                case "deleteLast":
                    node.DeleteLast();
                    break;
            }
        }
        node.Print();
    }
}

class NodeList{
    NodeList.Node head;

    class Node{
        int key ;
        NodeList.Node right;
        NodeList.Node left;

        Node(int key){
            this.key = key;
        }

        Node(){
            this.key = -1;
        }

        public String toString(){
            return Integer.toString(key);
        }

        public void printDetail(){
            System.out.println(this.left.key + ' ' + this.key +' ' + this.right.key);
        }
    }

    NodeList(){
        this.head = new NodeList.Node();
        this.head.right = this.head;
        this.head.left = this.head;
    }

    public void Insert(int x){
        NodeList.Node newNode = new NodeList.Node(x);
        newNode.right = this.head.right;
        newNode.right.left = newNode;
        this.head.right = newNode;
        newNode.left = this.head;
    }

    public void Print(){
        PrintWriter out = new PrintWriter(System.out);
        NodeList.Node point = this.head.right;
        NodeList.Node start = this.head.right;
//        boolean flag = false;
        while(point != this.head) {
            out.print(point.toString());
            point = point.right;
//            if (flag && point == start) {
//                break;
//            }
            if (point != this.head) out.print(' ');
//            flag = true;
        }
        out.println("");
        out.flush();
    }

    public void PrintAll() {
        System.out.println(this.head);
        NodeList.Node point = this.head.right;
        while(point != this.head) {
            point.printDetail();
            point = point.right;
        }
        System.out.println('\n');
    }

    public void Delete(NodeList.Node point){
        point.right.left = point.left;
        point.left.right = point.right;
    }

    public void SearchDelete(int x){
        NodeList.Node point = this.head.right;
        while(point != this.head) {
            if(point.key == x) break;
            point = point.right;
        }
        this.Delete(point);
    }

    public void DeleteFirst(){
        this.Delete(this.head.right);
    }

    public void DeleteLast(){
        this.Delete(this.head.left);
    }

}

