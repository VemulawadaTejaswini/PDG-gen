import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long h = sc.nextLong();

		int n = 0;
		double hp = 1;
		for(int i=0;i<100;i++) {
			if(i!=0) {
				hp *= 2;
			}
			if(h<hp) {
				n=i;
				break;
			}
		}

		long ans = 0;
		for(int i=0;i<n;i++) {
			double add = Math.pow(2, i);
			ans += (long)add;
		}

		System.out.println(ans);

	}
}
