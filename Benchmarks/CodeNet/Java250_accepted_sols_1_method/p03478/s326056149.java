
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = 0;
		for (int i = a; 0 < i; i--) {
			String s = String.valueOf(i);
			int temp = 0;
			for (int j = 0; j < s.length(); j++) {
				temp += Integer.parseInt(s.substring(j, j + 1));
			}
			if (temp >= b && temp <= c) {
				sum += i;
			}
		}
		
        System.out.println(sum);
	}
}