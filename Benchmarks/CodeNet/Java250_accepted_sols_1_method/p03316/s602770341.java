import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] strs = str.split("");
		int num = Integer.parseInt(str);
		int sum = 0;
		for(int i = 0; i < strs.length; i++) {
			sum += Integer.parseInt(strs[i]);
		}
		System.out.println(num%sum==0 ? "Yes" : "No");
	}
}