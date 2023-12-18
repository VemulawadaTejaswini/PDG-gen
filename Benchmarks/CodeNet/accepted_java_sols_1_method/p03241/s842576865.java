import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<Integer> a = new ArrayList<>();
		for(int i=1;i<=Math.sqrt(m);i++) {
			if(m%i==0) {
				a.add(i);
				a.add(m/i);
			}
		}
		a.sort(Comparator.naturalOrder());
		int i = 0;
		while(a.get(i)<n) {
			i++;
		}
		System.out.println(m/a.get(i));

	}

}
