import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int start = 0;
		int goal = 0;

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'A') {
				start = i;
				break;
			}
		}
		for(int j = s.length() - 1; j > 0; j--) {
			if (s.charAt(j) == 'Z') {
				goal = j;
				break;
			}
		}
		System.out.println(goal - start + 1);
	}

}
