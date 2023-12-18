import java.util.LinkedList;	//ArrayListだと間に合わない
import java.util.ListIterator;
import java.util.Scanner;

class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		ListIterator<Integer> ite = list.listIterator();

		int n = scan.nextInt();

		for(int i=0; i<n; i++) {
			int query = scan.nextInt();

			switch(query) {

			case 0:
				int a = scan.nextInt();

				ite.add(a);
				ite.previous();
				break;

			case 1:
				int b = scan.nextInt();
				if(0 <= b) {
					for(int j=0; j<b; j++) {
						ite.next();
					}
				}else {
					for(int j=0; j>b; j--) {
						ite.previous();
					}
				}
				break;

			case 2:
				ite.next();
				ite.remove();
				break;
			}
		}

		for(Integer a : list) {
			System.out.println(a);
		}
	}
}
