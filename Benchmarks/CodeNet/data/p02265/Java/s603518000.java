
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int SENTINEL = 100000007;
    public static int MAX = 10007;
    public static int NIL = -1;

    public static int[] dp = new int[100];


    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> A = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            String command = sc.next();
            if(command.equals("insert")) {
                int x = sc.nextInt();
                A.add(0, x);
            }
            else if(command.equals("delete")) {
                int x = sc.nextInt();
                if(A.indexOf(x) >= 0) {
                    A.remove(A.indexOf(x));
                }
            }
            else if(command.equals("deleteFirst")) {
                A.remove(0);
            }
            else {
                A.remove(A.size() - 1);
            }
        }
        Integer[] B = new Integer[A.size()];
        A.toArray(B);
        for(int i = 0; i < A.size(); i++) {
            if(i > 0) System.out.print(" ");
            System.out.print(B[i]);
        }
        System.out.println();
    }

}


class Stack {
    int top;
    int MAX = 100007;
    int[] S = new int[MAX];

    Stack() {
        top = 0;
    }
    boolean isEmpty() {
        return top == 0;
    }
    boolean isFull() {
        return top > MAX;
    }
    void push(int x) {
        if(isFull()) return;
        top++;
        S[top] = x;
    }
    int pop() {
        if(isEmpty()) return -1;
        top--;
        return S[top + 1];
    }
}
class P {
    String name;
    int time;
    P(String n, int t) {
        name = n;
        time = t;
    }
}