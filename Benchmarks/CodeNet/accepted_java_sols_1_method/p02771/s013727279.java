import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&a!=b)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
