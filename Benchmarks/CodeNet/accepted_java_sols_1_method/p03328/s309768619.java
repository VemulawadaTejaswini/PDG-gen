import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();	
		int b = sc.nextInt();
		
		int c=1;
		for(int i=2;i<b-a;i++) {
			c+=i;
		}
		System.out.println(c-a);
	}
}
