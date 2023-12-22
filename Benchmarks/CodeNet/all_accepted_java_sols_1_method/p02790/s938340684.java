import java.util.*;
/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		String ans = "";
		int i;
		for(i=0;i<max;i++) {
			ans += Integer.toString(min);
		}
		System.out.print(ans);
		
	}

}
