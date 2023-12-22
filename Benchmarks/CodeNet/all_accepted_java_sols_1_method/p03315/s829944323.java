import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		for (char c : sc.nextLine().toCharArray()) {
			if (c == '+') {
				num++;
			} 
			if (c == '-') {
				num--;
			} 
		}
		System.out.println(num);
	}
}