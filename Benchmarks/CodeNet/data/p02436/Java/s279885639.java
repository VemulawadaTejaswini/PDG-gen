import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.lang.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ", 0);
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        
        Queue[] queues = new Queue[n];
        for (int i = 0; i < n; i++) {
            queues[i] = new Queue();
        }
        
        String[] l;
        String command;
        int t, x;
        for (int i = 0; i < q; i++) {
            l = br.readLine().split(" ", 0);
            command = l[0];
            t = Integer.parseInt(l[1]);
            switch (command) {
                case "0":
                    x = Integer.parseInt(l[2]);
                    queues[t].enqueue(x);
                    break;
                case "1":
                    queues[t].front();
                    break;
                case "2":
                    queues[t].dequeue();
                    break;
            }
        }
    }
}

class Queue {
    ArrayList<Integer> a;
    
    Queue() {
        a = new ArrayList<Integer>();
    }
    
    void enqueue(int x) {
        a.add(x);
    }
    
    void front() {
        int size = a.size();
        if (size != 0) {
            System.out.println(a.get(0));
        }
    }
    
    void dequeue() {
        int size = a.size();
        if (size != 0) {
            a.remove(0);
        }
    }
}

    

