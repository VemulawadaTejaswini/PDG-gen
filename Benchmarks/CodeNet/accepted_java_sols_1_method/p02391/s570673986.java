import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanNum = new Scanner(System.in);
		int a = scanNum.nextInt();
		int b = scanNum.nextInt();
		if(a<b){
			System.out.println("a < b");
		}
		else if (a>b) {
			System.out.println("a > b");
		}
		else if (a==b) {
			System.out.println("a == b");
		}
	}
}