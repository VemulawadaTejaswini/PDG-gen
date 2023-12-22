import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		HashSet<Integer> aSet = new HashSet<>();
		HashSet<Integer> bSet = new HashSet<>();

		for(int i=0; i<M; i++){
			int a = Integer.parseInt(sc.next());
			int b =  Integer.parseInt(sc.next());
			if (a == 1){
				bSet.add(b);
			}
			if (b == N){
				aSet.add(a);
			}
		}
		aSet.retainAll(bSet);
		if (aSet.size() == 0){
			System.out.println("IMPOSSIBLE");
		}else {
			System.out.println("POSSIBLE");
		}
	}
}