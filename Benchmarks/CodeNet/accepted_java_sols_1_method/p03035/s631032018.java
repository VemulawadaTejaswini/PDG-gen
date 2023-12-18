import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		int money = sc.nextInt();
		
		if(age>=13) {
			System.out.println(money);
			
		}else if(age>=6 && age<=12) {
			System.out.println(money/2);
		}else {
			System.out.println(0);
		}
		
	}
}
