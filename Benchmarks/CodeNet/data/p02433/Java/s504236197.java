import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			List<Integer> L = new LinkedList<Integer>();
			ListIterator<Integer> LI = L.listIterator();
			int i;

			for(int j=0;j<q;j++) {
				switch(sc.nextInt()) {
				case 0:
					LI.add(sc.nextInt());
					LI.previous();
					break;
				case 1:
					int num = sc.nextInt();
					if(num>0)
						for(i=0;i<num;i++) {
							LI.next();
						}
					else
						for(i=num;i<0;i++) {
							LI.previous();
						}
					break;
				case 2:
					LI.next();
					LI.remove();
					break;
				}
			}
			L.forEach(s -> System.out.println(s));
		}
	}
}
