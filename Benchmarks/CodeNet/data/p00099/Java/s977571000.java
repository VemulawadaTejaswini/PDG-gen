//Volume0-0099
import java.util.*;

public class Main {
	public static void main(String[] args) {
	int n,q,a,v,top;
	int[] sum;
	
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = new int[n+2];
		top = n+1;
		sum[top] = Integer.MIN_VALUE;
		q = sc.nextInt();
		for(int i=0;i<q;i++){
			a = sc.nextInt();
			v = sc.nextInt();
			sum[a] += v;
			if(v<0&&a==top){
				top = n+1;
				sum[top] = Integer.MIN_VALUE;
				for(int j=1;j<=n;j++){
					if((sum[j]>sum[top])||(sum[j]==sum[top] && j<top)){
						top=j;
					}
				}
			} else {
				if((sum[a] > sum[top]) || (sum[a] == sum[top] && a < top)){
					top = a;
				}
			}
			System.out.println(top+" "+sum[top]);
		}
	}
}