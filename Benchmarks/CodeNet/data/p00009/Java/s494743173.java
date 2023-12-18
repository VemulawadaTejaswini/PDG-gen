import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(sc.hasNext()) {
			System.out.println(calc(sc.nextInt()));
		}
	}

	public static int calc(int num) {
		int count = 1;
		boolean result;

		for(int i = 3; i <= num; i+=2) {
			result = true;
			for(int j = 3; j < i; j+=2) {
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