import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a  =sc.nextInt();
		int b = sc.nextInt();
		for(int i = 1; i <= 10000; i++) {
			int num1 =(int) (i*0.08);
			int num2 = (int) (i*0.10);
			if(num1 == a && num2 == b) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}
