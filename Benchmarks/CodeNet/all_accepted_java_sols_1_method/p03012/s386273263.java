import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		ArrayList<Integer> wArrayList = new ArrayList<>();

		for (int i=0; i<n; i++){
			wArrayList.add(Integer.parseInt(sc.next()));
		}

		int ans = Integer.MAX_VALUE;

		for (int i=0; i<n; i++){
			List<Integer> lList = wArrayList.subList(0, i);
			List<Integer> rList = wArrayList.subList(i, wArrayList.size());

			int lsum = lList
		  		      .stream()
		  		      .mapToInt(v -> v)
		  		      .sum();

			int rsum = rList
		  		      .stream()
		  		      .mapToInt(v -> v)
		  		      .sum();

			if (ans > Math.abs(lsum - rsum)){
				ans = Math.abs(lsum - rsum);
			}
		}
		System.out.println(ans);
	}
}