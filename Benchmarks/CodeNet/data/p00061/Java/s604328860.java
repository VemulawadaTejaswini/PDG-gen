import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[102][2];
		while(true){
			String[] s = sc.next().split(",");
			int b = Integer.valueOf(s[0]);
			int c = Integer.valueOf(s[1]);
			if(b==0 && c==0) break;
			a[b][0] = c;
		}
		
		Arrays.sort(a, new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				return o2[0] - o1[0];
			}
		});

		int cnt = 1;
		a[0][1] = 1;
		for(int i=1;i<102;i++){
			if(a[i][0]<a[i-1][0]) cnt++;
			a[i][1] = cnt;
		}
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			System.out.println(a[n][1]);
		}
	}	
}