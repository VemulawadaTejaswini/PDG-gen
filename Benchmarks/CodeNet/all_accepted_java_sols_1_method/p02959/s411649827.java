import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		b[n]=0;
		
		long ans =0;
		int res =0;
		
		for(int i=0;i<=n;i++) {
			ans+=Math.min(a[i], b[i]+res);
			res=Math.min(b[i], b[i]+res-a[i]);
			res=Math.max(res, 0);
		}
		
		System.out.println(ans);

}
	
	
	
}



