import java.util.Scanner;
 
public class Main {

	public static final MyScanner in = new MyScanner();

	public static void main(String[] args) {

		int N = in.nextInt();

		int breakCnt = 0;
		int wanted = 1;
		for(int i=0; i<N; i++) {
			int target = in.nextInt();
			if (target == wanted) {
				wanted++;
			} else {
				breakCnt++;
			}
		}

		System.out.println(breakCnt == N ? -1 : breakCnt);

	}


	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}
}