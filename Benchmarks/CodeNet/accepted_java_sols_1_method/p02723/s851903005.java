import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = s.split("");
		if (arr[2].equals(arr[3]) && arr[4].equals(arr[5])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
