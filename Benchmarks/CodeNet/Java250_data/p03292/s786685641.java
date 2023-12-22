import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        PriorityQueue<Integer> P = new PriorityQueue<>(Comparator.reverseOrder());
        P.add(Math.abs(A-B));
        P.add(Math.abs(B-C));
        P.add(Math.abs(C-A));
        P.poll();
        System.out.println(P.poll()+P.poll());
        sc.close();
    }
}