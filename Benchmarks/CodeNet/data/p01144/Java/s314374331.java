import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[][] map = new int[n][2];
			for(int i=0;i<n;i++){
				map[i][0] = sc.nextInt();
				map[i][1] = sc.nextInt();
			}
			
			Arrays.sort(map, new Comparator<int[]>(){
				public int compare(int[] o1, int[] o2) {
					return o2[0] - o1[0];
				}
			});
			
			int sum = 0;
			boolean flag = false;
			for(int i=0;i<n;i++){
				if(flag==false){
					if(m<=map[i][0]){
						sum += (map[i][0]-m)*map[i][1];
						flag = true;
					}else{
						m -= map[i][0];
					}
				}else{
					sum += map[i][0] * map[i][1];
				}
			}
			System.out.println(sum);
		}	
	}	
}