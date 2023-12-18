//we_love_golf
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int max_k_multi = (b / k) * k;
		
		if(a<=max_k_multi) {
			System.out.println("OK");
		} else {
			System.out.println("NG");
		}
	}
}
