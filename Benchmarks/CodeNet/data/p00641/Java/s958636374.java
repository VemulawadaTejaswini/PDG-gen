import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int[][] map = new int[n][n];
			for(int i=0;i<n;i++){
				map[i][sc.nextInt()] = sc.nextInt();
				map[i][sc.nextInt()] = sc.nextInt();
			}

			long ans = 1;
			boolean[] flg = new boolean[n];
			for(int i=0;i<n;i++){
				max = Long.MIN_VALUE;
				if(!flg[i]) ans *= getPattern(map,flg,i);
			}

			System.out.println(ans%10007);
		}
	}

	static long max;

	public static long getPattern(int[][] map,boolean[] flg,int index){
		flg[index] = true;

		int a,b;
		for(a=0;map[index][a]==0;a++);
		for(b=a+1;map[index][b]==0;b++);
		max = Math.max(max,Math.max(map[index][a],map[index][b]));

		long res = 0;
		int nextIndex = flg[a] ? flg[b] ? -1 : b : a;

		if(nextIndex == -1){
			if(map[index][Math.min(a,b)] == max) return 1;
			return 0;
		}

		res += getPattern(map,flg,nextIndex);
		if(max == map[index][nextIndex]) res++;

		return res;
	}
}