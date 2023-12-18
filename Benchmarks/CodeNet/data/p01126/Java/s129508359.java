import java.util.Arrays;
import java.util.Scanner;


public class Main {
	
	public static class Path implements Comparable<Path>{
		int h, start, end;
		
		public Path(int h, int start, int end) {
			super();
			this.h = h;
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Path arg0) {
			return this.h - arg0.h;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			final int a = sc.nextInt();
			
			if(n == 0 && m == 0 && a == 0){
				break;
			}
			
			int[] ans = new int[n];
			for(int i = 0; i < n; i++){
				ans[i] = i + 1;
			}
			
			Path[] paths = new Path[m];
			for(int i = 0; i < m; i++){
				final int h = sc.nextInt();
				final int p = sc.nextInt() - 1;
				final int q = sc.nextInt() - 1;
				
				paths[i] = new Path(h, p, q);
			}
			
			Arrays.sort(paths);
			
			for(int i = 0; i < m; i++){
				int tmp = ans[paths[i].start];
				ans[paths[i].start] = ans[paths[i].end];
				ans[paths[i].end] = tmp;
			}
			
			System.out.println(ans[a - 1]);
		}
		
	}

}