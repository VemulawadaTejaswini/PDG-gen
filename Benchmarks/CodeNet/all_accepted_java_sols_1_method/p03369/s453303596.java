import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] memo  = s.toCharArray();
		int sum = 700;
		for(int i=0; i<memo.length; i++) {
			char c = memo[i];
			if(c == 'o') {
				sum = sum + 100;
			}
		}
		
		System.out.println(sum);
	}

}
