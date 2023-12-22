import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();

		List<Integer> d = new ArrayList<>();
		for(int i = 0;i < l;i++) {
			d.add(sc.nextInt());
		}

		List<Integer> workD = new ArrayList<>(d);
		Collections.sort(workD, Collections.reverseOrder());
		int max = workD.get(0);
		int nextMax = workD.get(1);

		if(max == nextMax) {
			for(int i = 0;i < l;i++) {
				System.out.println(max);
			}
		}else {
			for(int i = 0;i < l;i++) {
				System.out.println(max == d.get(i) ? nextMax : max);
			}
		}
	}
}
