import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(sc.hasNext()) {
			System.out.println(calc(sc.nextInt()));
		}
	}

	public static int calc(int num) {
		int count = 0;
		boolean result;

		for(int i = 2; i <= num; i++) {
			result = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					result = false;
					break;
				}
			}

			if(result) {
				count++;
			}
		}
		return count;
	}


}