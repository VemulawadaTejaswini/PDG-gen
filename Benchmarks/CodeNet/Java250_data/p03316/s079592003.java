import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(Solution(N));
	}
	static String Solution(int N) {
		int number = 0;
		String s = N+"";
		for(int i=0; i<s.length(); i++) {
			number = number + Integer.parseInt(s.charAt(i)+"");
		}
		if(N%number==0) {
			return "Yes";
		}
		return "No";
	}
}
