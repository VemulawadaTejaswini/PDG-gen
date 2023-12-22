import java.util.Scanner;

//?\????????????????
public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int year;
		int month;
		int day;
		String era = null;
		int eraYear = 0;


		while(sc.hasNext()) {
			boolean flag = false;
			year = sc.nextInt();
			month = sc.nextInt();
			day = sc.nextInt();


			if((year == 1989 && month == 1 && day >= 8) || (year == 1989 && month >= 2)  || (year >= 1990)) {
				era = "heisei";
				eraYear = year - 1989 + 1;
			} else if((year == 1926 && month == 12 && day >= 25) || (year >= 1927)) {
				era = "showa";
				eraYear = year - 1926 + 1;
			} else if((year == 1912 && month == 7 && day >= 30) || (year == 1912 && month >= 8)  || (year >= 1913)) {
				era = "taisho";
				eraYear = year - 1912 + 1;
			} else if((year == 1868 && month == 9 && day >= 8) || (year == 1868 && month >= 10)  || (year >= 1869)) {
				era = "meiji";
				eraYear = year - 1868 + 1;
			} else {
				flag = true;
			}

			if(flag) {
				System.out.println("pre-meiji");
			} else {
				System.out.println(era + " " + eraYear + " " + month + " " + day);
			}

		}
	}

}