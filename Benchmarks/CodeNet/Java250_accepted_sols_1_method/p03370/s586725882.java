import java.util.*;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int ming = 1000;
		
		for(int i=0;i<N;i++) {
			int m = sc.nextInt();
			X -= m;
			if(m < ming) {
				ming = m;
			}
		}
		System.out.println(N+X/ming);
	}
}
