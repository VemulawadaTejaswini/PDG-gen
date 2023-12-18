import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			Queue<String> q = new LinkedList<String>();
			while(true) {
				String s = sc.next();
				if (s.equals("-")) break;
				int times = sc.nextInt();
				int [] moves = new int[times];
				for (int i=0; i<times; i++) {
					moves[i] = sc.nextInt();
				}
				String result = Shuffle(s, times, moves);
				q.add(result);
			}
			int a = q.size();
			for (int i=0; i<a; i++) {
				System.out.println(q.remove());  //結果表示
			}
		}
	}

	static String Shuffle(String s,int times, int[] moves) {
		String s2 = s;
		for (int i=0; i<times; i++) {
			int m = moves[i];
			String s3 = s2.substring(m)+s2.substring(0,m);
			s2 = s3;
		}
		return s2;
	}
}
