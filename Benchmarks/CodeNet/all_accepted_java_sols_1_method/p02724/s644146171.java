import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = x/500;
		long z = (x-y*500)/5;
		long sum = y * 1000 + z*5;

		System.out.println(sum);
	}

}
