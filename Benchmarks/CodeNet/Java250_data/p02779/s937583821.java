import java.util.HashSet;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		int n;
 
		Scanner sc = new Scanner(System.in);
 
		n = sc.nextInt();
 
		HashSet<Integer> hs = new HashSet<Integer>();
 
		boolean flag = false;
		String ans = "";
 
		for (int i = 1; i <= n; i++) {
 
			int tmp = sc.nextInt();
 
			if (hs.contains(tmp)) {
				flag = true;
				break;
			} else {
				hs.add(tmp);
			}
		}
 
		if (flag) {
			ans = "NO";
		} else {
			ans = "YES";
		}
 
		System.out.println(ans);
 
	}
 
}