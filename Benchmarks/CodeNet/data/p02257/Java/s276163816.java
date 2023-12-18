import java.util.Scanner;

public class Main {
	
	/*public static Boolean primenumber(int n) {
		Boolean result = true;
		int mid = (int)(n^(1/2));
		if (n > 2) {
			for (int i = 2; i < mid; i++) {
				if (n%i == 0) {
					result = false;
					break;
				}
			}
		}
		return result;
	}*/
	
	public static Boolean primenumber(int n) {
		if (n <= 3) {
			return n > 1;
		}
		else if (n%2 == 0 || n%3 == 0) {
			return false;
		}
		int i = 5;
		while (i*i <= n) {
			if (n%i == 0 || n%(i + 2) == 0) {
				return false;
			}
			i = i + 6;
		}
		return true;
	}
	
	public static int numberprimes(int[] P) {
		int counter = 0;
		for (int p : P) {
			if (primenumber(p)) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numintegers = in.nextInt();
		int[] P = new int[numintegers];
		int index = 0;
		while (index < numintegers) {
			int num = in.nextInt();
			P[index] = num;
			index++;
		}
		in.close();
		int result = numberprimes(P);
		System.out.println(result);
	}
}

