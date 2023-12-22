import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = 0;
		for(int i = 1; i <= n; i+=2) {
			int k = 0;
			for(int j = 1; j <= i; j++) {
				double x = (double)i / j;
				if(x - Math.floor(x) == 0)k++;
			}
			if(k == 8)l++;
		}

		System.out.println(l);
	}

}