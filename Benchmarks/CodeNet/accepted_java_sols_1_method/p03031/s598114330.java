import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> light = new ArrayList<>();
		
		for(int i = 0; i < M; i++) {
			ArrayList<Integer> l = new ArrayList<>();
			int k = sc.nextInt();
			for(int j = 0; j < k; j++) {
				l.add(sc.nextInt() - 1);
			}
			light.add(l);
		}
		
		int[] ok = new int[M];
		for(int i = 0; i < M; i++) {
			ok[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < (Math.pow(2, N)); i++) {
			int[] sw = new int[N];
			Arrays.fill(sw, 0);
			for (int j = 0; j < N; j++) {
				if ((1 & i >> j) == 1) {
					sw[j] = 1;
				}
			}
			
			boolean flag = true;
			for(int j = 0; j < M; j++) {
				int sum = 0;
				for(int k = 0; k < light.get(j).size(); k++) {
					sum += sw[light.get(j).get(k)];
				}
				if(sum % 2 != ok[j]) {
					flag = false;
					break;
				}
			}
			if(flag)count++;
		}
		System.out.println(count);
	}
}