import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanNum = new Scanner(System.in);
		try {
			int a = scanNum.nextInt();
			int b = scanNum.nextInt();
			System.out.println((a*b)+" "+(a*2+b*2));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("?????????????????????"+e);
		}

	}
}