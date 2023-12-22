import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		
		int total = 0;
		for (int i = 1; i <= N; i++) {
			total += 800;
			if (i % 15 == 0) total -= 200;
		}
		
		System.out.println(total);		
	}
}
