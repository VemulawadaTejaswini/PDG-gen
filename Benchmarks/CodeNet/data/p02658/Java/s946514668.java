import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	int factors = scanner.nextInt();
      	long result = checkResult(scanner, factors);
      		System.out.print(result);
	}

	private static long checkResult(Scanner scanner, int factors) {
		final long limit = (long) Math.pow(10, 18);
		long result = 1l;
		for(int i = 0; i < factors; i++) {
      		long factor = scanner.nextLong();
      		result *= factor;
      		if(factor == 0)
      			return 0;
			if(result > limit || result < 0l)
        		return -1l;
      	}
		return result;
	}
}