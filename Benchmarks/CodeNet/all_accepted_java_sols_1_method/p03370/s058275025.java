import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int min_m = 1001;
		for(int i = 0; i < N; i++){
			int m = sc.nextInt();
			if(m < min_m) min_m = m;
			X -= m;
		}
		System.out.println(N + X / min_m);
	}
}