import java.util.Scanner;

public class Main {
	static int X;
	public  static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		X=sc.nextInt();
		if(X>=30) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		}
	}
