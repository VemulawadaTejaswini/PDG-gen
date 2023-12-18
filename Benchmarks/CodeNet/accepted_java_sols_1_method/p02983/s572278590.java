import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		if (L%2019==0||R%2019==0) {
			System.out.println(0);
			return ;
		}
		if (L/2019!=R/2019) {
			System.out.println(0);
			return ;
		}
		int min = 2019;
		for (long i=L;i<R;i++) {
			for (long j=i+1;j<=R;j++) {
				int temp = (int) (((i%2019)*(j%2019))%2019);
				if (temp<min) {
					min = temp;
				}
			}
		}
		System.out.println(min);
	}
}