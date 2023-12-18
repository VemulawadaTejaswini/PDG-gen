import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int year, month, day;
		int k;

		while (sc.hasNext()) {
			year  = sc.nextInt();
			month = sc.nextInt();
			day   = sc.nextInt();
			k = 0;
			
			k += year * 10000;
			k += month * 100;
			k += day;
			
			if (k < 18680908) {
				System.out.println("pre-meiji");
			} else if (k <= 19120729) {
				System.out.println("meiji " + (year - 1867) + " " + month + " " + day);
			} else if (k <= 19261224) {
				System.out.println("taisho " + (year - 1911) + " " + month + " " + day);
			} else if (k <= 19890107) {
				System.out.println("showa " + (year - 1925) + " " + month + " " + day);
			} else {
				System.out.println("heisei " + (year - 1988) + " " + month + " " + day);
			}
		}
	}
}