import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		char[] arr = new char[line.length()];

		for(int i = 0 ; i < line.length();i++) {
			arr[i] = line.charAt(i);
			if(Character.isLowerCase(arr[i])) {
				System.out.print(Character.toUpperCase(arr[i]));
			} else if(Character.isUpperCase(arr[i])) {
				System.out.print(Character.toLowerCase(arr[i]));
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.println();

	}

}

