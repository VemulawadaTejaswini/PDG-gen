import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		
		while (a > 0) {
			list.add(a%10);
			a /= 10;
		}
		
		int result = 0;
		for (int l : list) {
			if (l == 1) {
				result += l;
			}
		}
		
		System.out.println(result);
		
	}
}