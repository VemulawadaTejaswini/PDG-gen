import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

		String s = sc.next();
		String result = "";

		int count = 0;

		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			if(c == '(') {
				count++;
				result = result + "(";
			} else {
				if(count == 0) {
					result = "(" + result + ")";
				} else {
					count--;
					result = result + ")";
				}
			}

		}

		for(int i = 0; i < count; i++) {
			result = result + ")";
		}

		System.out.println(result);

	}
}
