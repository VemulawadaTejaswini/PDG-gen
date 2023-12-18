import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayDeque<Integer> list = new ArrayDeque<>();

		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int query = scan.nextInt();
			int a = scan.nextInt();

			switch(query) {

			case 0:
				int b = scan.nextInt();
				if(a == 0) {
					list.addFirst(b);
				}else {
					list.addLast(b);
				}
				break;
					
			case 1:
				Iterator<Integer> ite = list.iterator();
				for(int j=0; j<a; j++) {
						ite.next();
					}
				System.out.println(ite.next());
				break;

				
			case 2:
				if(a == 0) {
					list.removeFirst();
				}else {
					list.removeLast();
				}
				break;
			}
		}
		
	}
}
