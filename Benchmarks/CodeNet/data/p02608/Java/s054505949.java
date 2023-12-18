import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int[] ans = new int[10005];
		int v=0;
		for (int x = 1; x < 100; ++x) {
			for (int y = 1; y < 100; ++y) {
				for (int z = 1; z < 100; ++z) {
						v = x*x+y*y+z*z+x*y+y*z+z*x;
						if(v<10005) ans[v]++;
				}
			}
		}
			//System.out.println("["+i+"]"+ans);
			for(int i=0;i<N;++i){
				System.out.println(ans[i+1]);
			}
	}
}
