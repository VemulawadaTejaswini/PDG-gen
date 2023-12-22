import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		Set<Integer> intersection = new HashSet<Integer>();

		for(int i=0; i<m; i++){
			intersection.add(i+1);
		}

		for(int i=0; i<n; i++){
			int k = Integer.parseInt(sc.next());
			Set<Integer> set = new HashSet<Integer>();
			for(int j=0; j<k; j++){
				set.add(Integer.parseInt(sc.next()));
			}
			intersection.retainAll(set);
		}
		System.out.println(intersection.size());
	}
}