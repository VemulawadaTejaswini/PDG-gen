
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for ( int i = 1; i <= n; i ++){
			if (i % 3 == 0){
				continue;
			} else if (i % 5 == 0){
				continue;
			} else {
				list.add(i);
			}
		}

		long sum = 0;
		for (int f : list){
			sum += f;
		}

		System.out.println(sum);

	}

}
