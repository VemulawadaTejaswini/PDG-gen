import java.util.Scanner;

class Main {
	public static void main(String[] $){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();

		if (String.valueOf(n).indexOf("7") != -1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}