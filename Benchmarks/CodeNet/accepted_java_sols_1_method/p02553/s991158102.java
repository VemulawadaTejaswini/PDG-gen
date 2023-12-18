import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();
			
			long result = Long.MIN_VALUE;
			result = Math.max(result, a*c);
			result = Math.max(result, a*d);
			result = Math.max(result, b*c);
			result = Math.max(result, b*d);
			
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}