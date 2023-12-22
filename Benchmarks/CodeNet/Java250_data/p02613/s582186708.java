import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		
		for(int i = 0; i < N; i++) {
			 String C = scan.next();
			if(C.contentEquals("AC")) {
				count1++;
			}else if(C.contentEquals("WA")) {
				count2++;
			}else if(C.contentEquals("TLE")){
				count3++;
			}else {
				count4++;
		
			}
		}
		System.out.println("AC x "+count1);
		System.out.println("WA x "+count2);
		System.out.println("TLE x "+count3);
		System.out.println("RE x "+count4);
	}

}
