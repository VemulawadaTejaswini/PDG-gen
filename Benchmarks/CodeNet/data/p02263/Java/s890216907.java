
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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        Scanner sc = new Scanner(System.in);

        Stack S = new Stack();
        int a, b;
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("+")) {
                a = S.pop();
                b = S.pop();
                S.push(a + b);
            }
            else if(str[i].equals("-")) {
                a = S.pop();
                b = S.pop();
                S.push(b - a);
            }
            else if(str[i].equals("*")) {
                a = S.pop();
                b = S.pop();
                S.push(a * b);
            }
            else {
                S.push(Integer.parseInt(str[i]));
            }
        }
        System.out.println(S.pop());
    }

}

class Stack {
    int top;
    int MAX = 10001;
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