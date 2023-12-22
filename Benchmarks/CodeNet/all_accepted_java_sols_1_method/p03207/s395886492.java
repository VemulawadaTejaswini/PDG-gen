import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		ArrayList<Integer> p = new ArrayList<>();

		for(int i=0;i<N;i++) {
			p.add(sc.nextInt());
		}

		//pの最大値
		int pmax = Collections.max(p);
		//pの中でのpmaxのインデックス
		int pind = p.indexOf(pmax);
		//pの中のpmaxを半額にする
		p.set(pind, pmax/2);

		int sum=0;
		for(int i=0;i<N;i++) {
			sum += p.get(i);
		}

		System.out.println(sum);
	}
}