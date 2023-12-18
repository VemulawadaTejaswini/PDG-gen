
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split("");
		for (int i = 0; i < input.length; i++) {
			if(input[i].equals("1")) {
				System.out.print("9");
			}else {
				System.out.print("1");
			}
		}
	}
}