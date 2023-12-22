import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] num = new int[n];
			long[] sum = new long[n];
			
			for(int i=0;i<n;i++){
				int a = sc.nextInt();
				long b = sc.nextLong();
				long c = sc.nextLong();
				boolean flag = true;
				for(int j=0;j<i;j++){
					if(num[j]==0)break;
					if(a==num[j]){
						sum[j] += b*c;
						flag = false;
					}
				}
				if(flag==true){
					num[i] = a;
					sum[i] += b*c;
				}
				
			}
			
			boolean na = true;
			for(int i=0;i<n;i++){
				if(sum[i]>=1000000){
					System.out.println(num[i]);
					na = false;
				}
			}
			if(na==true)System.out.println("NA");
			
		}
	}
}