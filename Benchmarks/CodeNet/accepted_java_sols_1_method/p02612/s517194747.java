public class Main{
	public static void main(String[] args) {
		int N = new java.util.Scanner(System.in).nextInt();
		int result = -N;

		while(result< 0) {
			result += 1000;
		}
		System.out.println(result);
	}
}