import java.util.Scanner;

public class Main {

	static long money;
	static int year,type,charge;
	static double rate;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			money=cin.nextLong();
			year=cin.nextInt();
			int n = cin.nextInt();
			long max=0;
			while(n--!=0){
				type=cin.nextInt();
				rate=cin.nextDouble();
				charge=cin.nextInt();
				if(type==0){
					max=Math.max(tanri(money),max);
				}
				else{
					max=Math.max(hukuri(money),max);
				}
			}
			System.out.println(max);
		}
	}
	static long tanri(long money){
		long sum=0;
		for(int i = 0;i<year;i++){
			sum+=(double)money*rate;
			money-=charge;
//			System.out.println(sum);
		}
//		System.out.println(money+sum);
		return money+sum;
	}
	static long hukuri(long money){
		for(int i = 0;i<year;i++){
//			System.out.println((double)money*rate);
			money=(long) (money+((double)money*rate)-charge);

//			System.out.println(money);
		}
		return money;
	}
}