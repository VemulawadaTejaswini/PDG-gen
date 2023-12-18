import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(1L);
		list.add(2L);
		list.add(3L);
		list.add(4L);
		list.add(5L);
		list.add(6L);
		list.add(7L);
		list.add(8L);
		list.add(9L);
		
		int i = 0;
		while(list.size() < k) {
			long x = list.get(i);
			if (x % 10 != 0) list.add((10*x) + (x % 10) - 1);
			list.add((10*x) + (x % 10));
			if (x % 10 != 9) list.add((10*x) + (x % 10) + 1);
			i++;
		}
		
		
		System.out.println(list.get(k-1));
	}
}