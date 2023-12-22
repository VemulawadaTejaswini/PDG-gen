import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] array = new String[n];

		int account = 0;
		int wacount = 0;
		int tlecount = 0;
		int recount = 0;

		for(int i=0;i<array.length;i++) {
			array[i] = scan.next();
			if(array[i].equals("AC")) {
				account = account + 1;
			}else if(array[i].equals("WA")) {
				wacount = wacount + 1;
			}else if(array[i].equals("TLE")) {
				tlecount = tlecount + 1;
			}else if(array[i].equals("RE")) {
				recount = recount + 1;
			}
		}

		System.out.println("AC x "+account);
		System.out.println("WA x "+wacount);
		System.out.println("TLE x "+tlecount);
		System.out.println("RE x "+recount);

	}

}