import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int c = 0;
		
		for (int i=0; i<N; i++) {
			if (sc.nextInt() == c+1) {
				c++;
			}
		}
		System.out.println(c==0 ? -1 : N-c);
	}
}