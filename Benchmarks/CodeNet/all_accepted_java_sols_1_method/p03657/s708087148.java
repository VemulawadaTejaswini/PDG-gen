import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = 0;
		int sum = a+b;
		
		if (a%3 == 0){
			c += 1;
		}
		if (b%3 == 0){
			c += 1;
		}
		if (sum%3 == 0){
			c += 1;
		}
		
		if (c>0){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}
	}
}
