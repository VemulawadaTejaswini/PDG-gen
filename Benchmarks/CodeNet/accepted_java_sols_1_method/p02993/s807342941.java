import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] arr = s.split("");
		boolean dif = false;
		for (int i=1; i<arr.length; i++) {
			if (arr[i].equals(arr[i-1])) {
				dif = true;
			}
		}

		if (dif) {
			System.out.println("Bad") ;
		} else {
			System.out.println("Good");
		}

	}

}
