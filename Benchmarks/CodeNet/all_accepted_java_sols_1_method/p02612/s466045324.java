import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n%1000==0) {
			System.out.println(0);
		}
		else {
			System.out.println(1000-n%1000);
		}
	}

}
