import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		
		while(list.size() != N) {
			list.add(0);
		}
		
		for(int i=0; i<Q; i++){
			int x = sc.nextInt();
			list.set(x-1, list.get(x-1)+1);
		}
		
		for(int j = 0; j<list.size();j++) {
			if(Q-list.get(j) < K) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}