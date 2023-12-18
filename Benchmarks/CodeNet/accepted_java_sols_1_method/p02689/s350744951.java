import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        long[] high = new long[n+1];
        long[] max = new long[n+1];
        int a =0;
        int b =0;
        int cnt =0;
        for(int i=1;i<=n;i++) {
        	high[i] = sc.nextLong();
        	max[i] = 0;
        	//System.out.println(high[i]);
        }
        for(int i = 0;i<m;i++) {
        	a=sc.nextInt();
        	b=sc.nextInt();
        	if(max[a]<high[b]) {
        		max[a] =high[b];
        	}
        	if(max[b]<high[a]){
        		max[b] = high[a];
        	}
        }
        for(int i=1;i<=n;i++) {
        	if(max[i]<high[i]) {
        		cnt+=1;
        	}
        }
      

System.out.println(cnt);



	}
}