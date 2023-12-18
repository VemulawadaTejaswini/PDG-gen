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
        
        Stack[] stacks = new Stack[n];
        for (int i = 0; i < n; i++) {
            stacks[i] = new Stack();
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
                    stacks[t].push(x);
                    break;
                case "1":
                    stacks[t].top();
                    break;
                case "2":
                    stacks[t].pop();
                    break;
            }
        }
    }
}

class Stack {
    ArrayList<Integer> a;
    
    Stack() {
        a = new ArrayList<Integer>();
    }
    
    void push(int x) {
        a.add(x);
    }
    
    void top() {
        int size = a.size();
        if (size != 0) {
            System.out.println(a.get(a.size() - 1));
        }
    }
    
    void pop() {
        int size = a.size();
        if (size != 0) {
            a.remove(a.size() - 1);
        }
    }
}
