import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long max = Math.max(a, b);
			long min = Math.min(a, b);
			max = Math.max(max, c);
			min = Math.min(min, c);

			System.out.println(min+" "+max);
		}
	}
}

