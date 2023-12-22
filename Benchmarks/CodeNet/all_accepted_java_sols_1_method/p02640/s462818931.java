import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(y%2==0 && 2*x<=y && y<=4*x) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
}
