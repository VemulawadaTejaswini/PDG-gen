import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	static Scanner sc = new Scanner(System.in);
	static int[] balls;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		while(n-- > 0) {
			// read input 
			Queue<Integer> que = new LinkedList<Integer>();
			for(int i = 0; i < 10; i++) que.add(sc.nextInt());
			int b = 0, c = 0;
			while(!que.isEmpty()) {
				int d = que.poll();
				if(b < d) {
					b = d;
				} else if(c < d) {
					c = d;
				} else {
					break;
				}
			}
			if(que.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}