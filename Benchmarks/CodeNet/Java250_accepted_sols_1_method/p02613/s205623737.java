import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		
		for(int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		
		int ac = 0;
		int wa = 0;
		int tle = 0;
		int re = 0;
		
		for(int i = 0; i < n; i++) {
			switch(s[i]) {
			case "AC":
				ac++;
				break;
			case "WA":
				wa++;
				break;
			case "TLE":
				tle++;
				break;
			case "RE":
				re++;
				break;
			}
		}
		
		System.out.println("AC x " + ac);
		System.out.println("WA x " + wa);
		System.out.println("TLE x " + tle);
		System.out.println("RE x " + re);
		
	}

}
