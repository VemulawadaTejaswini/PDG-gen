import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<N;i++) {
			int n = sc.nextInt();
			if(!set.contains(n)) {
				set.add(n);
			}
		}
		System.out.println(set.size());
	}
}
