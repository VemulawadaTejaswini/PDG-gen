	import java.util.*;
	public class Main {
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int[] x=new int[1001];
			long all = (int)1e9+7;
			int n=sc.nextInt();
			for(int i=2;i<=n;i++){
				int j = 2;
				int t = i;
				while(t>1){
					if(t%j==0){
						x[j]++;
						t/=j;
					}
					else j++;
				}
			}
			Arrays.sort(x);
			long t = 1;
			for(int i=1000;i>=0;i--){
				t*=(x[i]+1);
				t%=all;
			}
			System.out.print(t);
		}
	}