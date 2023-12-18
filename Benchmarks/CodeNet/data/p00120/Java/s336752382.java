import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String[] arr = sc.nextLine().split(" ");
			int len = Integer.valueOf(arr[0]);
			int n = arr.length-1;
			int[] r = new int[n];
			for(int i=0;i<n;i++) r[i] = Integer.valueOf(arr[i+1]);
			
			Integer[] a = new Integer[1<<n];
			for(int i=0;i<1<<n;i++) a[i] = i;
			Arrays.sort(a, new Comparator<Integer>(){
				public int compare(Integer o1, Integer o2) {
					String num1 = Integer.toBinaryString(o1);
					int cnt1 = 0;
					for(int i=0;i<num1.length();i++) if(num1.charAt(i)=='1') cnt1++;
					
					String num2 = Integer.toBinaryString(o2);
					int cnt2 = 0;
					for(int i=0;i<num2.length();i++) if(num2.charAt(i)=='1') cnt2++;
					
					return cnt1-cnt2;
				}
			});
			
			
			double[][] dp = new double[1<<n][n];
			for(int i=0;i<1<<n;i++){
				for(int j=0;j<n;j++){
					dp[i][j] = Double.MAX_VALUE;
				}
			}
			for(int i=0;i<1<<n;i++){
				for(int j=0;j<n;j++){
					if(i==0){
						dp[1<<j][j] = r[j]*2;
					}else if((a[i]>>j&1)==1){
						for(int k=0;k<n;k++){
							if((a[i]>>k&1)==0){
								double tmp = dp[a[i]][j] - r[j] + r[k] + Math.sqrt((r[j]+r[k])*(r[j]+r[k]) - (r[j]-r[k])*(r[j]-r[k]));
								int id = a[i] + (1<<k);
								dp[id][k] = Math.min(dp[id][k], tmp);
							}
						}
					}
				}
			}
		
			double min = Double.MAX_VALUE;
			for(int i=0;i<n;i++){
				min = Math.min(min, dp[(1<<n)-1][i]);
			}
			
			if(min<=len) System.out.println("OK");
			else System.out.println("NA");
		}
	}
}