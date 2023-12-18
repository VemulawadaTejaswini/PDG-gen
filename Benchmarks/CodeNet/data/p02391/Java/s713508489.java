import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lines = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(lines[0]);
		int num2 = Integer.parseInt(lines[1]);
		String result;
		if(num1 < num2){
			result = "a < b";
		} else if(num1 > num2) {
			result = "a > b";
		} else {
			result = "a == b";
		}

		System.out.println(result);

	}
}