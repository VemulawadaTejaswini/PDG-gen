import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		Arrays.sort(num);
		int dis1 = num[2] - num[0];
		int dis2 = num[2] - num[1];
		int ans = 0;
		if( dis1%2==0 && dis2%2==0 ){
			ans = dis1/2 + dis2/2;
		}else if( dis1%2!=0 && dis2%2!=0 ){
			ans = dis1/2 + dis2/2 + 1;
		}else{
			ans = dis1/2 + dis2/2 + 2;
		}
		System.out.println(ans);
	}
}
