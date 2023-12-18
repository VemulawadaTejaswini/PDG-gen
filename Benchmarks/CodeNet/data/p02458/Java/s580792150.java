import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Main {
	public static void main(String[] args){
		int i, j, q, order, x, counter = 0;
		List<Integer> a = new ArrayList<Integer>(1);
		TreeSet<Integer> set = new TreeSet<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				order = sc.nextInt();
				x = sc.nextInt();
				switch(order) {
				case 0 :
					if(!set.add(x)) {
						a.add(x);
						counter++;
					}
					System.out.println(set.size() + counter);
					break;
				case 1 :
					if(set.contains(x)) {
						if(a.contains(x)) {
							System.out.println(a.lastIndexOf(x) - a.indexOf(x) + 2);
						}else {
							System.out.println(1);
						}
					}else {
						System.out.println(0);
					}
					break;
				case 2 :
					if(set.remove(x)) {
						while(a.contains(x)) {
							a.remove(a.indexOf(x));
							counter--;
						}
					}
					break;
				case 3 :
					NavigableSet<Integer> subset = set.subSet(x, true, sc.nextInt(), true);
					for(Integer output : subset) {
						System.out.println(output);
						if(a.contains(output)) {
							for(j = 0; j < a.lastIndexOf(x) - a.indexOf(x) + 1; j++) {
								System.out.println(output);
							}
						}
					}
					break;
				}
			}
		}
	}
}


