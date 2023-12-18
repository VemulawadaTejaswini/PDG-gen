import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int K = sc.nextInt();
		List<Long> A = new ArrayList<>();
		for(int i = 0; i < X; i++)
			A.add(sc.nextLong());
		Collections.sort(A, Collections.reverseOrder());
		List<Long> B = new ArrayList<>();
		for(int i = 0; i < Y; i++)
			B.add(sc.nextLong());
		Collections.sort(B, Collections.reverseOrder());
		List<Long> C = new ArrayList<>();
		for(int i = 0; i < Z; i++)
			C.add(sc.nextLong());
		Collections.sort(C, Collections.reverseOrder());
		List<Long> tasteAB = new ArrayList<>();
		List<Long> taste = new ArrayList<>();
		for(int i = 0; i < X; i++) {
			for(int j = 0; j < Y; j++) {
				if(i*j > K)
					break;
				tasteAB.add(A.get(i) + B.get(j));
			}
		}
		Collections.sort(tasteAB, Collections.reverseOrder());
		for(int i = 0; i < tasteAB.size(); i++) {
			if(i > K)
				break;
			for(int j = 0; j < Z; j++) {
				if(i*j > K)
					break;
				taste.add(tasteAB.get(i) + C.get(j));
			}
		}
		Collections.sort(taste, Collections.reverseOrder());
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < K; i++)
			ans.append(taste.get(i) + "\n");
		System.out.println(ans);
	}

}
