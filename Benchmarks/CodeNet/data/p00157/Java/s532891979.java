import java.util.*;
import java.util.Map.Entry;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n= sc.nextInt();
			if(n==0) break;
			Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				map.put(sc.nextInt(), sc.nextInt());
			}
			int m= sc.nextInt();
			int h,r;
			for(int i=n;i<n+m;i++){
				h=sc.nextInt();
				r=sc.nextInt();
				if(map.containsKey(h)){
					if(map.get(h)>r){
						map.put(h, r);
					}
				}else{
					map.put(h,r);
				}
			}
			int[] rArray = new int[map.size()];
			Iterator<Entry<Integer, Integer>> entries = map.entrySet().iterator();
			int i=0;
			while(entries.hasNext()) {
				Map.Entry entry = entries.next();
				//int keyName = (Integer) entry.getKey();
				int valName = (Integer)entry.getValue();
				rArray[i] = valName;
				i++;
			}
			int[] dp = new int[rArray.length+1];
			int max;
			for(int j=1;j<dp.length;j++){
				max = 0;
				for(int k=1;k<=j;k++){
					if(rArray[j-1]>rArray[k-1]){
						if(dp[k]>max){
							max = dp[k];
						}
					}
				}
				dp[j] = max + 1;
			}
			max = -1;
			for(int j=0;j<dp.length;j++){
				if(max<dp[j]){
					max = dp[j];
				}
			}
			System.out.println(max);
		}
	}
}