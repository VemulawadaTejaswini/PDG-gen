import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int A = scan.nextInt();
		
		int ans = H/A;
		if (H%A>0) {
			ans++;
		}
		System.out.print(ans);
	}

}