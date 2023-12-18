import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int n = scan.nextInt();
		String s = scan.next();
		int n = s.length();
		scan.close();
		Deque<Integer> y1 = new ArrayDeque<Integer>();
		Deque<Integer> y2 = new ArrayDeque<Integer>();
		Deque<Integer> x = new ArrayDeque<Integer>();
//		ArrayList<Integer> h1 = new ArrayList<Integer>();
//		int h = 0;
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '\\') {
				y1.addFirst(i);
			}else if(c == '/' && y1.size() > 0) {
				int j = y1.pollFirst();
				int a = i - j;
				sum += i - j;
				while(x.size() > 0 && y2.getFirst() > j) {
					a += x.poll();
					y2.poll();
				}
				x.addFirst(a);
				y2.addFirst(j);
			}
		}
		System.out.println(sum);
		if(sum == 0) {
			System.out.println(0);
			System.exit(0);
		}
		System.out.print(x.size() + " ");
		int k = x.size();

		for(int i = 0; i < k - 1; i++) {
			System.out.print(x.pollLast() + " ");
		}
		System.out.println(x.poll());
	}
}
