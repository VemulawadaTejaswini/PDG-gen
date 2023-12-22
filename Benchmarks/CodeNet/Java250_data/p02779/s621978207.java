import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute7_2();
	}
	
	

	private static void execute7_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();

			Long s[] = new Long[N];

			for (int i = 0; i < N; i++) {
				s[i]=sc.nextLong();
			}
			
			Arrays.sort(s, Comparator.reverseOrder());
			

			boolean d=false;
			for (int i = 1; i < N; i++) {
				if(s[i-1].equals(s[i])) {
					d=true;
					break;
				}
			}
			
			if(d) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
			
		}
	}
}