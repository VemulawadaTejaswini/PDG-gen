//https://atcoder.jp/contests/abc161
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        Queue<Long>  queue = new LinkedList<>();
        for (long i = 1; i <= 9; i++) {
            queue.add(i);
        }
        for (int i = 0; i < k-1; i++) {
            Long x = queue.poll();
            long lastDigit = x % 10;
            if (lastDigit != 0) queue.add(10 * x + lastDigit -1);
            queue.add(10 * x + lastDigit);
            if (lastDigit != 9) queue.add(10*x + lastDigit + 1);
        }

        out.println(queue.poll());
        out.close();

    }
}
