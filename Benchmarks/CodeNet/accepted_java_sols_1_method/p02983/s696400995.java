import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long L = scan.nextLong();
		long R = scan.nextLong();
		long min = Long.MAX_VALUE;

		for(long i=L;i<R;i++) {
			for(long j=L+1;j<=R;j++) {

			long re = (i*j)%2019;
			if(re < min) {
				min = re;
			}else if(re == 0) {
				System.out.println(0);
				return;
			}
			}
		}

		System.out.println(min);
		scan.close();

	}

}
