import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Double> pque = new PriorityQueue<>();
        for(int i = 0; i < n; i++) pque.add(sc.nextDouble());
        while(pque.size() > 1) {
            double tmp = (pque.poll() + pque.poll()) / 2.0;
            pque.add(tmp);
        }
        System.out.println(pque.poll());
    }
}
