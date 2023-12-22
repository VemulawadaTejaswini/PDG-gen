import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = Long.parseLong(sc.next());
		long R = Long.parseLong(sc.next());
		sc.close();
		long mod = 2018;
		long cal = 0;
		for(long i = L;i <= R;i++) {
			for(long j = i+1;j <=R;j++) {
				cal = (i * j)%2019;
				if(cal < mod) {
					mod = cal;
				}else if(cal == 0) {
					System.out.println(0);
					return;
				}
			}
		}
		System.out.println(mod);
	}
}