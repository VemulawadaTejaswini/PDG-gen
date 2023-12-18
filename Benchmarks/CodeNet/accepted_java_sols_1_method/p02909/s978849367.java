import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans[] = {"Sunny", "Cloudy", "Rainy"};
		for(int i = 0; i < 3; i++) {
			if(S.equals(ans[i])) {
				System.out.println(ans[(i + 1) % 3]);
			}
		}
	}
}
