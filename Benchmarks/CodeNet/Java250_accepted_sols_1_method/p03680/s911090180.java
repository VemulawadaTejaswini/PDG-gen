import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		List<Integer> A = new ArrayList<Integer>();

		for (int i=0; i<N; i++){
			A.add(Integer.parseInt(sc.next()));
		}

		int j = 0;
		int ans = 0;
		for (int i=0; i<N; i++){
			j = A.get(j)-1;
			ans += 1;
			if (j == 1){
				System.out.println(ans);
				return;
			}
		}
		System.out.println(-1);
		return;
	}
}