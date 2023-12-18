import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        int n, q, time = 0;
        Queue<String> queueName = new ArrayDeque<String>();
        Queue<Integer> queueTime = new ArrayDeque<Integer>();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String s[] = sc.nextLine().split(" ");
            queueName.add(s[0]);
            queueTime.add(Integer.parseInt(s[1]));
        }

        while (!queueName.isEmpty()) {
            String qn = queueName.poll();
            int t = queueTime.poll();

            time += (t > q)? q: t;

            if (t > q) {
                queueTime.add(t - q);
                queueName.add(qn);
            } else {
                System.out.println(qn + " " + time);
            }
        }
    }
}