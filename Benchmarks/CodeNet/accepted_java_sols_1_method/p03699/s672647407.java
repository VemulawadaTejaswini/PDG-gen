import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int min = Integer.MAX_VALUE;
		int sum =0;
		int s;
		for (int i = 0;i < n; ++i){
			s = Integer.parseInt(scan.next());
			if (s%10 != 0){
				min = Math.min(min,s);
			}
			sum+=s;
		}

		if (min != Integer.MAX_VALUE && sum%10 ==0){
			sum-=min;
		}
		if (sum%10 ==0){
			System.out.print(0);
		}else{
			System.out.print(sum);
		}


	}
}
//end
