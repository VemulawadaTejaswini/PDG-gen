import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int N = sc.nextInt();
		int X = sc.nextInt();
		for(int i = 0;i<N;i++){
			int j = sc.nextInt();
			numbers.add(j);
			X -= j;
		}
		Collections.sort(numbers);
		System.out.println(X/numbers.get(0)+N);
	}

}
