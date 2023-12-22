import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		Scanner scanner = new Scanner(System.in);
 		int sum = 1;
 		int N = scanner.nextInt();
 		String S = scanner.next();
 		String[] splitArray = S.split("");
 		
 		for (int i = 1; i < splitArray.length; i++) {
 			if (splitArray[i - 1].equals(splitArray[i])) {
 			} else {
 				sum += 1;
 			}
 		}
 		System.out.println(sum);
	}

}
