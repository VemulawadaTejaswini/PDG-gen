import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double A = 0; double B = 0;
		A = Math.max(0, n-k+1);
		for(int L = 1; L <= Math.min(n, k-1); L++) {
			int l = L;
			int i = 0;
			while(true) {
				if(l >= k) {
					break;
				}else {
					i++;
					l = L * (int)Math.pow(2,i);
				}
			}
			B += Math.pow(0.5, i);
		}
		System.out.println((A+B)/n);
		sc.close();

	}

}