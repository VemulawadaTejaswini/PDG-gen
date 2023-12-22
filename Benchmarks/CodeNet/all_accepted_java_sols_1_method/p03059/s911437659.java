import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int b=s.nextInt();
		int t=s.nextInt();
		
		int ans=0,cur=a;
		
		while(cur<=t) {
			ans+=b;
			cur+=a;
		}
		
		System.out.println(ans);
	}

}
