import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] yobi = {"Sunday","Monday","Tuesday","Wednesday",
							"Thursday","Friday","Saturday"};
		int step1 = 2004 + (2004/4);
		int step2 = step1 - (2004/100);
		int step3 = step2 + (2004/400);
		while(sc.hasNext()){
			int month = sc.nextInt();
			int day = sc.nextInt();
			if(month == 0 & day == 0) break;
			int step4 = ((month*13) + 8) / 5;
			int step5 = step3 + step4;
			int step6 = step5 + day;
			int step7 = step6 % 7;
			System.out.println(yobi[step7]);
		}
	}
}