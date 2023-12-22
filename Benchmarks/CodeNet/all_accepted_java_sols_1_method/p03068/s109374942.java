import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();

		char c = s.charAt(k - 1);

		String ans = s.replaceAll("[^" + c + "]", "*");
		System.out.println(ans);

		sc.close();
	}

}
