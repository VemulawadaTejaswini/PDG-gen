import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		String[] splitArray = N.split("");
		int sum = 0;

 		for (int i = 0; i < splitArray.length; i++) {
 			//System.out.println(splitArray[i]);
 			sum += Integer.parseInt(splitArray[i]);
 		}
 		//System.out.println(sum);


		if (sum % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}