
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
	public static void main(String[] args){
		int i, q, order, x;
		Set<Integer> set = new HashSet<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				order = sc.nextInt();
				x = sc.nextInt();
				if(order == 0) {
					set.add(x);
					System.out.println(set.size());
				}else {
					if(set.contains(x)) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
				}
			}
		}
	}
}
