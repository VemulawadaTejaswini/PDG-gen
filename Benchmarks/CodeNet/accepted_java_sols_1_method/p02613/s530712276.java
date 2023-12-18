import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> listAC = new ArrayList<String>();
		List<String> listWA = new ArrayList<String>();
		List<String> listTLE = new ArrayList<String>();
		List<String> listRE = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String s = sc.next();
			switch (s) {
			case "AC" : listAC.add(s); break;
			case "WA" : listWA.add(s); break;
			case "TLE" : listTLE.add(s); break;
			case "RE" : listRE.add(s); break;
			}
		}
		System.out.println("AC x " + listAC.size());
		System.out.println("WA x " + listWA.size());
		System.out.println("TLE x " + listTLE.size());
		System.out.println("RE x " + listRE.size());
//		AC x 3
//		WA x 1
//		TLE x 2
//		RE x 0

	}
}
