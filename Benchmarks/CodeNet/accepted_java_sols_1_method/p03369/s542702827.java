import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int sum = 700;
		for(char x : input.toCharArray() ) {
			if(x == 'o')
				sum += 100;
		}
		System.out.print(sum);
	}
}