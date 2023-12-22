import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> value = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			value.add(Integer.parseInt(sc.next()));
		}
		sc.close();

		Collections.sort(value);

		double tmp = (double)(value.get(0) + value.get(1)) / 2;
		if(N == 2) {
			System.out.println(tmp);
			return;
		}else {
			for(int i = 2; i < value.size(); i++) {
				tmp = (double) (tmp + value.get(i)) / 2;
			}
			System.out.println(tmp);
			return;
		}
	}

}