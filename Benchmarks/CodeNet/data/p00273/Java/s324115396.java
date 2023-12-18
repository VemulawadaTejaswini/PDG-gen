import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int x[] = new int[N];
		int y[] = new int[N];
		int b[] = new int[N];
		int p[] = new int[N];
		for(int i = 0; i<N ; i++){
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
			b[i] = scan.nextInt();
			p[i] = scan.nextInt();
		}
		for(int i = 0; i<N ; i++){
			double m = 0;
			m = x[i] * b[i] + y[i] * p[i];
			if((b[i] >= 5 && p[i] >= 2) || b[i]>= 5){
				m = m *0.8;
			}
			int M = (int)m;
			System.out.println(M);
		}
	}
}