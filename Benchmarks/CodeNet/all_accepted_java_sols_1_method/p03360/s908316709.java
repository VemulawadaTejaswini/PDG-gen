import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		list.sort(null);
		
		for(int i = 0; i < k; i++) {
			int max = list.get(2) * 2;
			list.set(2, max);
			
		}
		
		int result = list.get(0) + list.get(1) + list.get(2);
		System.out.println(result);
		
	}
}