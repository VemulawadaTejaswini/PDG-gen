import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] ans = new boolean[n];
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b){
				ans[i]=true;
			}else{
				ans[i]=false;
			}
		}
		
		for(int i=0;i<n;i++){
			if(ans[i]==true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}