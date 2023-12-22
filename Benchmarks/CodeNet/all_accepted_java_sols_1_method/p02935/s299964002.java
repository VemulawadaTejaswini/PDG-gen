import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        PriorityQueue<Double> queue = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            queue.add((double)Integer.parseInt(sc.next()));
        }
        Double a,b;
        while(queue.size() > 1){
            a = queue.poll();
            b = queue.poll();
            queue.add((a+b)/2.0);
        }
        System.out.println(queue.poll());
        sc.close();
    }
}