import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
		int n = sc.nextInt();
		if(n == 0) break;
		int[] s = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextInt();
			sum += s[i];
		}
		double m = sum*1.0 / n;
		double wa = 0;
		for (int i = 0; i < n; i++) {
			wa += (s[i] - m) * (s[i] - m);
		}
		double a = Math.sqrt(wa / n);
		System.out.printf("%5f\n",a);
		}
	}
}