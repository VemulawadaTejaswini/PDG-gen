
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int earliest = 1200;
		for(int i = 1; i <= 9; i++) {
			int j = i * 111;
			if(N <= j && j < earliest) {
				earliest = j;
			}
		}
		System.out.println(earliest);
	}

}
