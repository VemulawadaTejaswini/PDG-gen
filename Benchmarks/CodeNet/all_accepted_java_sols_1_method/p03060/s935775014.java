import java.lang.reflect.Array;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []v=new int[n];
		int []c=new int[n];
		int []ans=new int[n];
		int k=0;
		for(int i=0;i<n;i++) {
			v[i]=sc.nextInt();
		};
		for(int i=0;i<n;i++) {
			c[i]=sc.nextInt();
		};
		
		for(int i=0;i<n;i++) {
			ans[i]=v[i]-c[i];
		}
		Arrays.sort(ans);
		for(int i=0;i<n;i++) {
			if(ans[i]<0) {
				;
			}else {
				k+=ans[i];
			}
			
		}
		
		System.out.println(k);
	}

}
