import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int current = 0;
		int ans = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 1 ; true ; i++) {
			current += i;
			list.add(current);
			if(current == x) {
				ans = i;
				break;
			} else if(current > x) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
		sc.close();

	}

}
