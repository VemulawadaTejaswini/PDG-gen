import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			String[] name = new String[n];
			int[][] map = new int[n][];
			int[] a = new int[30];
			for(int i=0;i<n;i++){
				name[i] = sc.next();
				int m = sc.nextInt();
				map[i] = new int[m];
				for(int j=0;j<m;j++){
					int p = sc.nextInt();
					map[i][j] = p;
					a[p]++;
				}
			}
			
			int[] ans = new int[n];
			int min = Integer.MAX_VALUE;
			int sum;
			for(int i=0;i<n;i++){
				sum = 0;
				for(int j=0;j<map[i].length;j++) sum += (n+1-a[map[i][j]]);
				min = Math.min(min, sum);
				ans[i] = sum;
			}
			
			ArrayList<String> list = new ArrayList<String>();
			for(int i=0;i<n;i++){
				if(ans[i]==min) list.add(name[i]);
			}
			Collections.sort(list);
			System.out.println(min + " " + list.get(0));
		}
	}

}