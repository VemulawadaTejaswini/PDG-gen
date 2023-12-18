import java.util.ArrayList;
import java.util.Scanner;

//5-2 線形探索
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		ArrayList<Integer> S = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			S.add(Integer.parseInt(sc.next()));
		}
		int q = Integer.parseInt(sc.next());
		ArrayList<Integer> T = new ArrayList<>();
		for(int i = 0; i < q; i++) {
			T.add(Integer.parseInt(sc.next()));
		}
		
		sc.close();
		
		//線形探索
		int count = 0;
		for(int i = 0; i < T.size(); i++) {
			int tmp = T.get(i);
			if(S.contains(tmp)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
