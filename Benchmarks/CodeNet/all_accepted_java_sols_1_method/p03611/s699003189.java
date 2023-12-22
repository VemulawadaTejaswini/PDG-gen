import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());scan.nextLine();
		int a;
		int[] count = new int [100003];
		Arrays.fill(count, 0);
		for (int i =0;i < n; ++i){
			a=Integer.parseInt(scan.next());
			++count[a];
			++count[a+1];
			++count[a+2];
		}

		int ans =0;
		for (int i :count)ans=Math.max(i, ans);

		System.out.print(ans);



	}
}
//end
