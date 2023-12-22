
import java.util.*;
public class Main {// Main
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = a/n;
		int q2 = b/n;
		if(q2>q || a%n==0) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		
}
}