import java.util.Scanner;

public class Main {
	public static int head1 = 0;
	public static int head2 = 0;
	public static int tail = 0;
	public static String[] queue1 = new String[1000000];
	public static int[] queue2 = new int[1000000];
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int q = stdIn.nextInt();
		
		for (int i = 0; i < n; i++) {
			String a = stdIn.next();
			int b = stdIn.nextInt();
			enqueue(a, b);
		}
		
		int time = 0;
		while (head1 != tail) {
			String a = strDequeue();
			int b = intDequeue();
			if (b <= q) {
				time += b;
				System.out.println(a +" "+ time);
			}
			else {
				time += q;
				b -= q;
				enqueue(a, b);
			}
		}
	}
	
	public static void enqueue(String x, int y) {
		queue1[tail] = x;
		queue2[tail] = y;
		tail++;
	}
	
	public static String strDequeue() {
		return queue1[head1++];
	}
	
	public static int intDequeue() {
		return queue2[head2++];
	}
}