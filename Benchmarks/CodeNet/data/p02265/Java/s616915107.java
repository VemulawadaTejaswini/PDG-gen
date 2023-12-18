import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyScanner scan = new MyScanner();
        NodeList node = new NodeList();
        int n = scan.nextLong();
        int x;
        char[] query = new char[15];
        for (long i = 0; i < n; i++) {
            switch (scan.judgeQuery()) {
                case 'i':
                    x = scan.nextLong();
                    node.Insert(x);
                    break;
                case 'd':
                    x = scan.nextLong();
                    node.SearchDelete(x);
                    break;
                case 'f':
                    node.DeleteFirst();
                    break;
                case 'l':
                    node.DeleteLast();
                    break;
            }
        }
        node.Print();
    }
}

class MyScanner{
    InputStream in = System.in;
    StringBuilder sb = new StringBuilder();
    int tmp;
    char judgeQuery(){
        try {
            int q = in.read();
            //for(tmp=0; tmp<5; tmp++) tmp = in.read();
            in.skip(5);
            if(q=='i'){ in.skip(1); return 'i';}
            q = in.read();
            if(q==' ') return 'd';
            in.skip(4);
            if(q=='L') return 'l';
            in.skip(1);
            if(q=='F') return 'f';
        } catch (IOException e) {
            e.printStackTrace();
        }
        return '0';
    }

    int nextLong() {
        int n = 0;
        int nx = 0;
        try {
            nx = in.read();
            while('0'<=nx&&nx<='9'){
                n *= 10;
                n += nx - '0';
                nx = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return n;
    }
}

class Node{
    int key ;
    Node right;
    Node left;

    Node(int key){
        this.key = key;
    }
}

class NodeList{
    Node head;

    NodeList(){
        this.head = new Node(-1);
        this.head.right = this.head;
        this.head.left = this.head;
    }

     void Insert(int x){
        Node newNode = new Node(x);
        newNode.right = this.head.right;
        newNode.right.left = newNode;
        this.head.right = newNode;
        newNode.left = this.head;
    }

     void Print(){
        PrintWriter out = new PrintWriter(System.out);
        for(Node point = this.head.right; point != this.head.left; point = point.right) {
            out.print(point.key + " ");
        }
        out.println(this.head.left.key);
        out.flush();
    }

     void Delete(Node point){
        point.right.left = point.left;
        point.left.right = point.right;
    }

     void SearchDelete(int x){
        for(Node point = this.head.right; point != this.head; point = point.right) {
            if(point.key == x){this.Delete(point); break;}
        }
    }

     void DeleteFirst(){
        this.Delete(this.head.right);
    }

    void DeleteLast(){
        this.Delete(this.head.left);
    }

}
