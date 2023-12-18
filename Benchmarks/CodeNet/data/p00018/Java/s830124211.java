import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer [] lst = new Integer[5];
		for (int i=0;i<5;i++) {
			lst[i] = s.nextInt();
		}
		Arrays.sort(lst, Collections.reverseOrder());
		String ans = "" + lst[0];
		for (int i=1;i<5;i++) {
			ans += " " + lst[i];
		}
		System.out.println(ans);
	}
}

