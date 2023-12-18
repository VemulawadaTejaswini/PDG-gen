import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int x = Integer.parseInt(scan.next());
		int ans = 0;
		int sum = 0;

		while(x > sum){
			++ans;
			sum+=ans;
		}
		System.out.print(ans);

	}
}
//end
