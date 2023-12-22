import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		int b = Integer.parseInt(scan.next());
		int c = Integer.parseInt(scan.next());
		int k = Integer.parseInt(scan.next());

		int ans = 0;
		for (int i = 0;i < k; ++i){
			if (a > 0){
				ans+=1;
				a--;
			}else if (b > 0){
				b--;
			}else{
				ans-=1;
				c--;
			}
		}
		System.out.print(ans);

	}

}


//end