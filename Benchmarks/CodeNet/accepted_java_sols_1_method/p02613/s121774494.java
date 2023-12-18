import java.util.Scanner;

public class Main {
	public static final String AC = "AC";
	public static final String WA = "WA";
	public static final String TLE = "TLE";
	public static final String RE = "RE";
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int numAc = 0;
		int numWa = 0;
		int numTle = 0;
		int numRe = 0;
		for(int i = 0; i < num; i++) {
			String res = sc.next();
			switch (res) {
			case AC:
				numAc++;
				break;
			case WA:
				numWa++;
				break;
			case TLE:
				numTle++;
				break;
			case RE:
				numRe++;
				break;
			}
		}
		System.out.println(AC + " x " + numAc);
		System.out.println(WA + " x " + numWa);
		System.out.println(TLE + " x " + numTle);
		System.out.println(RE + " x " + numRe);
	}
}
