import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		String Array[] = N.split("");

		int total1 = 0,total2 = 0;

		if(1 == Array.length) {
			System.out.println(0);
			System.exit(0);
		}

		//先頭(偶数)を0にする
		for (int i = 0; i < Array.length; i++) {
			//先頭
			if(i % 2 == 0) {
				if(Array[i].equals("1")) {
					total1++;
				}
			}else {
				if(Array[i].equals("0")) {
					total1++;
				}
			}
		}

		//先頭(偶数)を1にする
		for (int i = 0; i < Array.length; i++) {
			//先頭
			if(i % 2 == 0) {
				if(Array[i].equals("0")) {
					total2++;
				}
			}else {
				if(Array[i].equals("1")) {
					total2++;
				}
			}
		}
		
		
		
		if(total1 < total2) {
			System.out.println(total1);
		}else {
			System.out.println(total2);
		}
	}

}