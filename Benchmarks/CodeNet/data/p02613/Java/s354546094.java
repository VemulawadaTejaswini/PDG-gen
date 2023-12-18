import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		String a[] = new String[n];

		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;

		for(int i=0;i<n;i++) {
			a[i] = in.next();
		}

		for(int i=0;i<n;i++) {
			if(a[i].contentEquals("AC")) {
				ac = ac + 1;
			}else if(a[i].contentEquals("WA")) {
				wa++;
			}else if(a[i].contentEquals("TLE")) {
				tle++;
			}else {
				re++;
			}
		}

		System.out.println("AC x "+ac);
		System.out.println("WA x "+wa);
		System.out.println("TLE x "+tle);
		System.out.println("RE x "+re);

	}

}
