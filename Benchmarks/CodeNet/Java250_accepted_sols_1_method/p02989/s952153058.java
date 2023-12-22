import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int tmp;
		ArrayList<Integer> d = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			tmp = sc.nextInt();
			d.add(tmp);
		}

		Collections.sort(d);

		int m = d.size()/2;
		int ans = d.get(m)-d.get(m-1);

		if(ans >= 1)System.out.println(ans);
		else System.out.println(0);
	}
}
