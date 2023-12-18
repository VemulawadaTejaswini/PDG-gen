import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int count = 0;
		
		if(a / 100 == 1) {
			count++;
			a -= 100;
		}
		
		
		if(a / 10 == 1) {
			count++;
			a -= 10;
		}
		
		if(a / 1 == 1) {
			count++;
		}
		System.out.println(count);

		sc.close();
	}
}