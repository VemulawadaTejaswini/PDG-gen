import java.util.*;
import java.io.*;

public class TaskA {
    public void solve() {
        int a=cin.nextInt();
        out.println(a+a*a+a*a*a);

    }

    public static void main(String[] args) throws IOException {
        TaskA solved = new TaskA();
        solved.solve();
        solved.out.close();
    }

    Scanner cin = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
}