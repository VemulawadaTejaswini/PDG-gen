import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int even = 0, odd = 0;
		if(k%2==1) {
			for (int i = 1; i <= n; i++) {
				if(i%k==0) count++;
			}
			System.out.println(Math.round(Math.pow(count,3)));
		}else {
			k /= 2;
			for (int i = 1; i <= n; i++) {
				if(i%k==0) {
					if((i/k)%2==0)even++;
					else odd++;
				}
			}
			System.out.println(Math.round(Math.pow(even,3)+Math.pow(odd,3)));
		}
		sc.close();
	}
}