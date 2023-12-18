import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int l = sc.nextInt();
		int r = sc.nextInt();
		int d = sc.nextInt();
		int ans = 0;
		
		for(int i =l;i<r+1;i++) {
			if(i%d==0)ans++;
		}
		System.out.println(ans);
	}

	static long yuclid(long a, long b) {
		long ans;
		if(a<b) {
			long aa = a;
			a=b;
			b=aa;
		}
		while(true) {
			if(b%a==0) {
				ans = a;
				break;
			}else {
				long aa =a;
				a= b%a;
				b=aa;
			}
		}
		return ans;
	}


	static long divn(int target, int times) {//10_9+7のあまり累乗版
		int sqtimes = (int)Math.sqrt(times);
		long ans = 1;
		for(int i =0;i<sqtimes;i++) {
			ans = (ans * target)%(bignum);
		}
		long holder = ans;
		ans = 1;
		for(int i =0;i<sqtimes;i++) {
			ans = (ans*holder)%(bignum);
		}
		for(int i=0;i<times - sqtimes*sqtimes;i++) {
			ans = (ans * target)%(bignum);
		}
		return ans;
	}

	static long div(long a) {//10_9+7のあまり
		if(a<0)a+=bignum;
		return a%(bignum);
	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
