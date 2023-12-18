import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();
		String result = new String();
		
		while(number > 0) {
			int nums = (int) ('a' + (number - 1) % 26);
			char temporal = (char) nums;
			result = temporal + result;
			number = number / 26;
			if(temporal == 'z')
				number--;
		}
		System.out.print(result);
	}
}
