import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Double> li = new ArrayList<Double>();
		for(int i = 0; i < N; i++) {
			li.add(sc.nextDouble());
		}
		Collections.sort(li);
		double sum = 0;
		for(int i = 1; i < N; i++) {
			if(i != 1) {
				sum = (sum + li.get(i)) / 2;
			}else {
				sum = (li.get(i) + li.get(i - 1)) / 2;
			}

		}
		System.out.println(sum);

	}

}