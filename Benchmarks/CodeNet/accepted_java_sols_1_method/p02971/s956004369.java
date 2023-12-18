
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			list.add(a[i]);
		}
		Collections.sort(list);
		Collections.reverse(list);
		for(int i = 0; i < n; i++) {
			if(a[i] == list.get(0)) {
				System.out.println(list.get(1));
			} else {
				System.out.println(list.get(0));
			}
		}
	}

}
