import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[102][3];
		int cnt = 0;
		while(true){
			String[] s = sc.next().split(",");
			a[cnt][0] = Integer.valueOf(s[0]);
			a[cnt][1] = Integer.valueOf(s[1]);
			if(a[cnt][0]==0 && a[cnt][1]==0) break;
			cnt++;
		}
		
		Arrays.sort(a, new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				return o2[1] - o1[1];
			}
		});

		cnt = 1;
		a[0][2] = 1;
		for(int i=1;i<102;i++){
			if(a[i][1]<a[i-1][1]) cnt++;
			a[i][2] = cnt;
		}
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(a[n][2]);
		}
	}	
}