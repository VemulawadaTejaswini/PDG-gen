import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		int x = Integer.parseInt(scan.next());
		int y = Integer.parseInt(scan.next());

		int ans=0;
		if (c*2<(a+b)){
			ans+=c*2*Math.min(x,y);

			if (c*2<a && x-y>0){
				ans+=c*2*(x-y);
			}else if (x-y>0){
				ans+=a*(x-y);
			}

			if (c*2<b && y-x>0){
				ans+=c*2*(y-x);
			}else if (y-x>0){
				ans+=b*(y-x);
			}
		}else{
			ans+=a*x+b*y;
		}
		System.out.print(ans);




	}
}
//end