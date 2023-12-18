import java.util.Scanner;

public class Main {

	static long bignum = 1000000000+7;

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();
		String[] ss = s.split("");
		int[] a = new int[ss.length];
		int onecounter = 0;
		for(int i =0;i<ss.length;i++) {
			a[i]= Integer.parseInt(ss[i]);
			if(a[i]==1)onecounter++;
		}
		int smaller = onecounter-1;
		if(smaller==-1) {
			smaller =1;
		}
		boolean check  =false;
		if(smaller==0) {
			smaller = 1;
			check  =true;
		}

		int[] plusAma = new int[n];
		int[] minusAma = new int[n];
		plusAma[0]= 1%(onecounter+1);
		minusAma[0] = 1%(smaller);
		for(int i=1;i<n;i++) {
			plusAma[i] = plusAma[i-1]*2%(onecounter+1);
			minusAma[i] = minusAma[i-1]*2%(smaller);
		}

		int zanteiplus = 0;
		int zanteiminus = 0;
		for(int i =0;i<ss.length;i++) {
			if(a[i]==1) {
				zanteiplus += plusAma[ss.length-1-i];
				zanteiplus = zanteiplus%(onecounter+1);
				zanteiminus += minusAma[ss.length-1-i];
				zanteiminus = zanteiminus%(smaller);
			}
		}


		int[] ans = new int[Math.min(n, 2*100000)];
		ans[0]=0;
		for(int i=1;i<ans.length;i++) {
			int aa = i;
			int c = 1;
			while(aa>1) {
				c+=aa%2;
				aa=aa/2;
			}
			ans[i]=ans[i%c]+1;
		}

		for(int i=0;i<n;i++) {
			int p =0;
			if(a[i]==1) {
				p= zanteiminus-minusAma[ss.length-1-i];
				if(p<0)p+=smaller;
				if(check) {
					System.out.println(0);
				}else {
					System.out.println(ans[p]+1);
				}

			}else {
				p=zanteiplus+plusAma[ss.length-1-i];
				p=p%(onecounter+1);
				System.out.println(ans[p]+1);
			}
		}
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
