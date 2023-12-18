
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		
		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		
		for(int i = 0 ; i <= 1000 ;i++) {
			if(k* i >= a && k*i <= b) {
				System.out.println("OK");
				return;
			}
		}
		System.out.println("NG");

	}

}
