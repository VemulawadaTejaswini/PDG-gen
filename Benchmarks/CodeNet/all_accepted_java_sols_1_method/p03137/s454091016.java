import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> absList = new ArrayList<Integer>();
		
		for (int i=0; i<k; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		
		for (int i=0; i<k-1; i++) {
			int a = list.get(i);
			int b = list.get(i + 1);
			absList.add(Math.abs(a - b));
		}
		Collections.sort(absList);
		Collections.reverse(absList);
		
		int count = 0;
		for (int i=n-1; i<absList.size(); i++) {
			count += absList.get(i);
		}
		
		System.out.println(count);
	}
}