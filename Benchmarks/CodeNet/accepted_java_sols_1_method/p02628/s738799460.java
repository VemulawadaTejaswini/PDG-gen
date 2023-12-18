import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Integer> pi = new ArrayList<>();

		for(int i=0; i<N; i++){
			pi.add(sc.nextInt());
		}

		Collections.sort(pi);

		int ans = 0;

		for(int i=0; i<K; i++){
			ans += pi.get(i);
		}

		System.out.println(ans);
		return;
	}
}
