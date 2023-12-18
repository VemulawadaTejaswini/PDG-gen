import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int res = 0;
		
		for(char c : s.toCharArray()) {
			res+=c=='-'?-1:1;
		}
		System.out.println(res);
	}
}