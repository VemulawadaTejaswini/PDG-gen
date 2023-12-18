import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int N = Integer.parseInt(sc.next());
        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());
        long sums = 0;
        
        for (int i = 1; i <= N; i++) {
            int sum = i / 10000 + i / 1000 % 10 + i / 100 % 10 + i / 10 % 10 + i % 10;
            if (sum >= A && sum <= B)   sums += i;
        }
        
        out.println(sums);
        
        out.flush();
    }
}