import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int val = n;
		int mod = 0;
		while (val > 0) {
			mod += val % 10;
			val /= 10;
		}
		if (n % mod == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
