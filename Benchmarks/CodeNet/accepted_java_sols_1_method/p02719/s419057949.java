import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long chu = n%k;
		long jian = Math.abs(chu-k);
		System.out.println(chu > jian ? jian : chu);
	}

}
