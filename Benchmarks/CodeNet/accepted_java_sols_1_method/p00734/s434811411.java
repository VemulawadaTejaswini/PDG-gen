import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			if(n+m==0)break;
			int[] taro = new int[n];
			int[] hana = new int[m];
			int tsum=0,hsum=0;
			for(int i=0;i<n;i++){
				taro[i]=in.nextInt();
				tsum+=taro[i];
			}
			for(int i=0;i<m;i++){
				hana[i]=in.nextInt();
				hsum+=hana[i];
			}
			int ans[] = {999,999};
			boolean sw = false;
			for(int i=0;i<n;i++){
				for(int s=0;s<m;s++){
					if(tsum-taro[i]+hana[s]==hsum-hana[s]+taro[i]&&taro[i]+hana[s]<ans[0]+ans[1]){
						ans[0]=taro[i];
						ans[1]=hana[s];
						sw=true;
					}
				}
			}
			if(sw==false)System.out.println("-1");
			else System.out.println(ans[0]+" "+ans[1]);
		}
	}
}