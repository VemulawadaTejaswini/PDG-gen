import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = 3;
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		if((list.get(0) == 5)&&(list.get(1) == 5)&&(list.get(2) == 7)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}