
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int  page_num = sc.nextInt();
		if (page_num % 2 == 1) {
			System.out.println(page_num / 2 + 1);
		}else {
			System.out.println(page_num / 2);
		}
	}
}