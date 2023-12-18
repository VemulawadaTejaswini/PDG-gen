import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		int[] map = new int[500001];
		for(int i = 0; i < 50001; i++){
			map[i] = -1;
		}
		
		Integer[] amount = new Integer[m];
		for(int i = 0; i < m; i++){
			amount[i] = sc.nextInt();
		}

		/* ?????????????????? */
		Arrays.sort(amount, Comparator.reverseOrder());

		int ret = coinChange(n, amount, map);
		System.out.println(ret);
		
	}

	public static int coinChange(int n, Integer[] amount, int[] map){
		if(n < 0){
			return -1;
		}else if(n == 0){
			return 0;
		}else if(map[n] != -1){
			return map[n] + 1;
		}else{
			int min = 50001;
			for(int i = 0; i < amount.length; i++){
				int ret = coinChange(n - amount[i], amount, map);
				if(ret >= 0 && ret < min){
					min = ret;
				}
			}
			map[n] = min;
			return map[n] + 1;
		}
	}
}