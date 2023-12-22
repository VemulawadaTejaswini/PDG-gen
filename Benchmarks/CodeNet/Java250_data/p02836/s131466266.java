import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String[] ss = s.split("");
		int counter =0;
		for(int i =0;i<(double)(ss.length)/2;i++) {
			if(!ss[i].equals(ss[ss.length-i-1])) counter++;
		}
		System.out.println(counter);

	}
	public static long calc(int n,int c) {
		long ans = 1;
		for(int i =1;i<n+1;i++) {
			ans = (ans * i)%1000000007;
		}
		ans = ans * reverse(c)%1000000007;

		return ans*reverse(n-c)%1000000007;
	}
	public static long reverse(int c) {
		long divider =1;
		for(int i =1;i<c+1;i++) {
			divider = (divider * i)%1000000007;
		}
		long dividerholder=divider;
		for(int i=1;i<10000;i++) {
			divider = divider*dividerholder%1000000007;
		}
		long dividerholder2 = divider;
		for(int i=1;i<100000;i++) {
			divider = divider*dividerholder2%1000000007;
		}
		for(int i=0;i<5;i++) {
			divider = divider*dividerholder%1000000007;
		}
		return divider;
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
