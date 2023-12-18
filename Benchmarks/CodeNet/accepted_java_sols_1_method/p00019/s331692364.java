import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long ans = 1;
		for(int i = n; i > 0; i--) {
			ans *= i;
		}
		System.out.println(ans);
	}

}