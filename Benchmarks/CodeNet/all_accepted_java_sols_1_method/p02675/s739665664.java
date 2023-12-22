
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		if(n <= 999){

			if(n%10 == 2 || n%10==4 || n%10==5 || n%10==7 || n%10==9) {

				System.out.println("hon");

			}else if(n%10 == 0 || n%10 == 1 || n%10 == 6 || n%10 == 8) {

				System.out.println("pon");

			}else if (n%10 ==3) {

				System.out.println("bon");
			}
			}
		}
	}


