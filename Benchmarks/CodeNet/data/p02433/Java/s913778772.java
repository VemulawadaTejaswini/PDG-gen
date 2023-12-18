import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List list = new List();
        
        int n = Integer.parseInt(br.readLine());
        
        String l;
        char query;
        int x, d;
        for (int i = 0; i < n; i++) {
            l = br.readLine();
            query = l.charAt(0);
            switch (query) {
                case '0':
                    x = Integer.parseInt(l.substring(2));
                    list.insert(x);
                    break;
                case '1':
                    d = Integer.parseInt(l.substring(2));
                    list.move(d);
                    break;
                case '2':
                    list.erase();
                    break;
            }
            //System.out.println("cursor: " + list.pointed.num);
            //list.printAll();
            //System.out.println("---");
        }
        list.printAll();
    }
}

class List {
    Node pointed;
    Node top, end;
    
    List() {
        top = new Node(Integer.MAX_VALUE, null, end);
        end = new Node(Integer.MAX_VALUE, top, null);
        pointed = end;
    }
    
    void insert(int x) {
        Node new_node = new Node(x, pointed.left, pointed);
        pointed.left.right = new_node;
        pointed.left = new_node;
        pointed = new_node;
    }
    
    void move(int d) {
        if (d > 0) {
            while (d > 0) {
                pointed = pointed.right;
                d--;
            }
        } else {
            while (d < 0) {
                pointed = pointed.left;
                d++;
            }
        }
    }
    
    void erase() {
        pointed.left.right = pointed.right;
        pointed.right.left = pointed.left;
        pointed = pointed.right;
    }
    
    void printAll() {
        Node now = top.right;
        while (now.right != null) {
            System.out.println(now.num);
            now = now.right;
        }
    }
}

class Node {
    int num;
    Node left, right;
    
    Node(int n, Node l, Node r) {
        num = n;
        left = l;
        right = r;
    }
}
    
