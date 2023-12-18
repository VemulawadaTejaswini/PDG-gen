import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int output = 0;
		for(int i = 0 ; i < 4 ; i++) {
			output += (input.charAt(i) == '+')? 1:-1;
		}
		System.out.println(output);
	}

}