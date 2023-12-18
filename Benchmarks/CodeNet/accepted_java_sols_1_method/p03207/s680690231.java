import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n;

		int max=0;
		int sum=0;
		int ans;
		int []p= {0,0,0,0,0,0,0,0,0,0};
		n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
			
			if(max<p[i]) {
				max=p[i];
			}
			sum+=p[i];
		}
		ans=sum-max+(max/2);
		System.out.println(ans);		
	}

}
