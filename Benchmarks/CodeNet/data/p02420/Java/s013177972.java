import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        Queue<Character> q = new ArrayDeque<>();

        while (true) {
            s = sc.next();
            if (s.equals("-"))
                break;
            
            for (int i = 0; i < s.length(); i++) {
                q.add(s.charAt(i));
            }

            int m;
            m = sc.nextInt();

            int[] h = new int[m];
            int sum = 0;

            for (int i = 0; i < m; i++) {
                h[i] = sc.nextInt();
                sum += h[i];
            }

            for (int i = 0; i < sum; i++) {
                q.add(q.poll());
            }
            for (int i = 0; i < s.length(); i++) {
                System.out.print(q.poll());
            }
            System.out.println();
        }

        sc.close();
    }
}
