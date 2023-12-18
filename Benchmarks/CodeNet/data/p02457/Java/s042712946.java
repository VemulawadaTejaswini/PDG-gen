import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			TreeSet<Integer> S = new TreeSet<Integer>();
			int q = sc.nextInt();
			for(int i = 0; i < q; i++) {
				int cmd = sc.nextInt();
				int x = sc.nextInt();
				if(cmd == 0) {
					S.add(x);
					System.out.println(S.size());
				}
				else if(cmd == 1){
					System.out.println(S.contains(x) ? "1" : "0");
				}
				else if(cmd == 2) {
					S.remove(x);
				}
				else /* cmd == 3 */{
					int r = sc.nextInt();
					S.subSet(x,true, r, true).forEach(xx->System.out.println(xx));
				}
			}
		}
	}
}

