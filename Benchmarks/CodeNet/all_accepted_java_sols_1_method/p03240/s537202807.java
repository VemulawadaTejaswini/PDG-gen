import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		boolean check = true;
		for(int X = 0; X <= 100; X++) {
			for(int Y = 0; Y <= 100; Y++) {
				int H = 1;
				for(int i = 0; i < N; i++) {
					if(h[i] != 0) {
						H = Math.abs(X - x[i]) + Math.abs(Y - y[i]) + h[i];
						break;
					}
				}
				check = true;
				for(int i = 0; i < N; i++) {
					if(h[i] != Math.max(H - Math.abs(X - x[i]) - Math.abs(Y - y[i]), 0)) check = false;
				}
				if(check) {
					System.out.println(X+" "+Y+" "+H);
					break;
				}
			}
			if(check) break;
		}
	}
}
