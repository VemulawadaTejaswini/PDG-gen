import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n,k;
		double win = 0;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int p = i;
			int j = 0;
			while(p<k) {
				j++;
				p = i*(int)Math.pow(2, j);
				
			}
			win += (1.0/(double)n)*Math.pow(0.5, j);

		}
//		String str = String.valueOf(String.format("%.13f", win));
		System.out.println(win);
	}
}
