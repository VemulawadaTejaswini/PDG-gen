import java.util.Scanner;
import java.util.TreeSet;

public class Main  {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		TreeSet<Integer> list = new TreeSet<Integer>();

		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			switch(a) {
			
			case 0:
				list.add(b);
				System.out.println(list.size());
				break;

			case 1:
				System.out.println(list.contains(b) ? "1" : "0");
				break;
				
			case 2:
				list.remove(b);
				break;
				
			case 3:
				int c = scan.nextInt();
				list.subSet(b, true, c, true).forEach(d -> System.out.println(d));
//				for(int value : list) {
//					System.out.println(value);
//				}
//				list.subSet(b, true, c, true);
				break;
			}
		}
	}
}

