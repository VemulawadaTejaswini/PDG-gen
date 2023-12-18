import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PriorityQueue<Integer> list = new PriorityQueue<>();
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int size = list.size();
		
		int prev = 0;
		for (int i = 0; i < size / 2; i++) {
			prev = list.poll();
		}
		System.out.println(list.peek()-prev);
		
	}

}
