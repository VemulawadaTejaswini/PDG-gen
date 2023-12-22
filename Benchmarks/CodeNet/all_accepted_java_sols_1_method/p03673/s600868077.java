import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer>deq = new ArrayDeque<Integer>();
		
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			for(int i = 0 ; i < n/2 ; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				deq.add(a);
				deq.addFirst(b);
			}
			for(int i = 0; i < n ; i++) {
			System.out.print(deq.poll()+" ");
			}
		}
		
		if(n % 2 == 1) {
			int a = sc.nextInt();
			deq.add(a);
			for(int i = 0 ; i < (n - 1)/2 ; i++ ) {
				int b = sc.nextInt();
				int c = sc.nextInt();
				deq.add(b);
				deq.addFirst(c);
			}
			for(int i = 0; i < n ; i++) {
				System.out.print(deq.poll()+" ");
				}
		}
 
	}

}
