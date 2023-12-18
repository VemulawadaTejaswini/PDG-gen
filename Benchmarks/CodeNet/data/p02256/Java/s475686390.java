import java.util.*;
import java.lang.*;

public class main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		while (n1 != 0 && n2 != 0) {
			int temp = n2;
			n2 = n1;
			n1 = temp % n1;
		}
		
		System.out.println((n1==0)? n2:n1);
		
		
		
	}
}

