import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int pt_t = 0;
		int pt_h = 0;

		for(int i=1; i<=n; i++){
			String wd_t = sc.next();
			String wd_h = sc.next();

			if(wd_t.compareTo(wd_h) > 0) {
				pt_t += 3;
			} else if(wd_t.compareTo(wd_h) < 0) {
				pt_h += 3;
			} else {
				pt_t++;
				pt_h++;
			}
		}

		System.out.println(pt_t + " " + pt_h);
	}

}