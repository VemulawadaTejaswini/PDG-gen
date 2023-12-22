import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
        int count=0;

        for(int i=0; i<N; i++) {
            int num = sc.nextInt();
            queue.add(num);
        }


        for(int i=0;i<K;i++) {
            int num = queue.poll();
            count+=num;
        }
        System.out.println(count);
	}

}
