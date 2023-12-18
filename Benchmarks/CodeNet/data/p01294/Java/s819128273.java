import java.io.*;
import java.util.*;

public class Main{
	
	//0210 start
	//0308 sample matched
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
				int max = getmax(sum);
				int min = getmin(sum);
				int maxind = getmaxInd(sum);
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
					
					//System.out.println("diff = " + diff + " now = " + now + "maxind = " + maxind + "secondmax = " + secondmax);
					if(diff > d){
						continue;
					}
					sum[i] = now;
					list.get(i).remove(list.get(i).size() - 1);
					isremove = true;
					break;
				}
				if(! isremove){
					break;
				}
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
					return res;
				}
				
			}
			else{
				res = Math.max(res, sum[i]);
			}
			
		}
		return res;
	}

	private int getmin(int[] sum) {
		int res = sum[1];
		for(int i = 1; i < sum.length; i++){
			res = Math.min(res,  sum[i]);
		}
		return res;
	}

	private int getmax(int[] sum) {
		int res = sum[0];
		for(int i = 1; i < sum.length; i++){
			res = Math.max(res, sum[i]);
		}
		return res;
	}
	
	private int getmaxInd(int[] sum) {
		int res = sum[0];
		int ind = 0;
		for(int i = 1; i < sum.length; i++){
			if(res < sum[i]){
				res = sum[i];
				ind = i;
			}
			else if(res == sum[i]){
				ind = -1;
			}
		}
		return ind;
	}

	public static void main(String [] args){
		new Main().doit();
	}
}