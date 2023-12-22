import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());

		String S = sc.next();
		ArrayList<Integer> ansList = new ArrayList<>();
		ansList.add(0);

		for (int i=1; i<N; i++){
			if (S.charAt(i-1) == 'A' && S.charAt(i) == 'C'){
				ansList.add(ansList.get(i-1) + 1);
			} else{
				ansList.add(ansList.get(i-1));
			}
		}

		for (int q=0; q<Q; q++){
			int l = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());

			System.out.println(ansList.get(r-1) - ansList.get(l-1));
		}
	}
}