import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextInt();
		long result = 0;
		long ten = 1;
		long eight = 1;
		long nine = 1;
		for(int i = 0; i < num; i++) {
			ten *= 10;
			nine *= 9;
			eight *= 8;
		}
		result = ten - 2*nine + eight;
		result %= (1000000000 + 7);
		System.out.println(result);
		scanner.close();
	}
}