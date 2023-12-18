import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		int N = s.nextInt();
		int x[] = new int[N];
		for(int i = 0; i<N;i++) {
			x[i]= s.nextInt();
			if(i>=1&&x[i]>x[i-1]) {
				int n = x[i];
				x[i]= x[i-1];
				x[i-1]= n;
			}
		}
		for(int j = 0;j<N-1;j++) {
			count = count +x[j];
		}
		System.out.println(count);
	}
}