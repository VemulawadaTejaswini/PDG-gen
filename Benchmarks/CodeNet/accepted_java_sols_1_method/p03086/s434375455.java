import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		int ans = 0;
		for (int i=0; i<s.length(); i++){
			int len = 0;
			for (int j=i; j<s.length(); j++){
				char c = s.charAt(j);
				if (c == 'A' || c == 'C' || c == 'G' || c == 'T'){
					len++;
				} else {
					break;
				}
			}
			ans = Math.max(ans, len);
		}
		System.out.println(ans);
	}
}