import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] array = a.toCharArray();
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] == array[i + 1]) {
				System.out.println("Bad");
				System.exit(0);
			}
		}
		System.out.println("Good");
	}
}