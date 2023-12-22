import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		System.out.print(Solution(s));
	}
	static int Solution(String s) {
		int sum = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)== '+') {
				sum = sum + 1;
			}else {
				sum = sum - 1;
			}
		}
		return sum;
	}
}
