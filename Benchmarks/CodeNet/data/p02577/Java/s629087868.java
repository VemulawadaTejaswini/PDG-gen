import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		try {
			long N = scn.nextInt();

			long num = N;
	        int s = 0;
	        while(num != 0){
	            s += num % 10;
	            num /= 10;
	        }

	        System.out.println(num % 9 == 0 ? "Yes" : "No");
		} catch (Exception e) {
			System.out.println("No");
		}
	}
}