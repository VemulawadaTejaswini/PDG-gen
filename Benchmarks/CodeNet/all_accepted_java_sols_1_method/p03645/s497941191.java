import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());

		HashSet<Integer> aSet = new HashSet<>();
		HashSet<Integer> bSet = new HashSet<>();

		for(int i=0; i<m; i++){
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());

			if (a == 1){
				bSet.add(b);
			}
			if (b == n){
				aSet.add(a);
			}
		}

		for(int i=1; i<=n; i++){
			if(aSet.contains(i) && bSet.contains(i)){
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
		return;

	}
}
