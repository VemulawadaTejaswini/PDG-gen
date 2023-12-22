import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	void A() {
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		System.out.println(Math.max(0,(H-h)*(W-w)));
	}
	void B() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int ans = 0;
		int []  B = new int[M];
		int [] A = new int[M];
		for(int i = 0; i < M; i++) B[i] = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int tmp = C;
			for(int j = 0; j < M; j++) {
				A[j] = sc.nextInt();
				tmp += A[j] * B[j];
			}
			if(tmp>0) ans++;
		}
		System.out.println(ans);
	}
	void C() {
		
	}
	void D() {
		
	}
	void doIt() {
		B();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}
