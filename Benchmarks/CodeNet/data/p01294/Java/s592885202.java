import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int d = sc.nextInt();
			if((n|d) == 0) break;
			ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
			int [] sum = new int[n];
			for(int i = 0 ; i< n; i++){
				int m = sc.nextInt();
				list.add(new ArrayList<Integer>());
				for(int j = 0; j < m; j++){
					int temp = sc.nextInt();
					sum[i] += temp;
					list.get(i).add(temp);
				}
			}
			
			while(true){
				int max = sum[0];
				int min = sum[0];
				int maxind = 0;
				for(int i = 1; i < n; i++){
					min = Math.min(min, sum[i]);
					if(max < sum[i]){
						max = sum[i];
						maxind = i;
					}
					else if(max == sum[i]) maxind = -1;
				}
				int secondmax = get2max(sum, max);
				
				boolean isremove = false;
				for(int i = 0; i < n; i++){
					if(list.get(i).size() == 0) continue;
					int now = sum[i] - list.get(i).get(list.get(i).size() - 1);
					int diff;
					if(i == maxind){
						diff = Math.max(now, secondmax) - Math.min(min, now);
					}
					else{
						diff = Math.max(now, max) - Math.min(min, now);
					}
					if(diff > d) continue;
					sum[i] = now;
					list.get(i).remove(list.get(i).size() - 1);
					isremove = true;
					break;
				}
				if(! isremove) break;
			}
			
			boolean ansflg = true;
			for(int i = 0; i < n; i++){
				if(list.get(i).size() != 0) ansflg = false;
			}
			System.out.println(ansflg ? "Yes" : "No");
		}
	}

	private int get2max(int[] sum, int max) {
		int res = 0;
		boolean flg = false;
		for(int i = 0; i < sum.length; i++){
			if(max == sum[i]){
				if(! flg){
					flg = true;
				}
				else{
					res = sum[i];
				}
			}
			else{
				res = Math.max(res, sum[i]);
			}
		}
		return res;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}