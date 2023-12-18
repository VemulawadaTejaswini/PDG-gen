public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		double T = sc.nextInt() + 0.5;

		int result = (int) (Math.floor(T / A) * B);

		System.out.println(result);
	}
}
