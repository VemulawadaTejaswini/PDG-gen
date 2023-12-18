import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc     = new Scanner(System.in);
		Integer nowTem = Integer.valueOf(sc.nextLine());

		if(nowTem >= 30) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}