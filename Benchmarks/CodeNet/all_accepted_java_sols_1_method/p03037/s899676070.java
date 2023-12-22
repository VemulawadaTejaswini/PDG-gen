
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		
		boolean[] list = new boolean[n];
		for(int i=0;i<n;i++)list[i]=true;
		
		for(int i=0;i<m;i++) {
			int l=sc.nextInt(),r=sc.nextInt();
			
			for(int j=0;j<l-1;j++) {
				list[j]=false;
			}
			for(int j=r;j<n;j++) {
				list[j]=false;
			}
			
		}
		
		int ans=0;
		for(int i=0;i<n;i++) {
			if(list[i]) {
				ans++;
				//System.out.println(i);
			}
		}
		System.out.println(ans);
		
	}

}
