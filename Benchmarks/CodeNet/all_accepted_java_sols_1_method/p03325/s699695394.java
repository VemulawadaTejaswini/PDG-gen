import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n =Integer.parseInt(scan.next());
		int ans=0, count,a;
		for(int i=0;i<n;++i){
			a=Integer.parseInt(scan.next());
			count=0;
			while(a%2==0){
				count++;
				a/=2;
			}
			ans+=count;
		}
		System.out.print(ans);

	}
}
//end