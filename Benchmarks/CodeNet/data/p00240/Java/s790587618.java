import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n,y;
	static Bank bank[];
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0){
				break;
			}
			int y =cin.nextInt();
			bank=new Bank[N];
			for(int i = 0;i<N;i++){
				int a = cin.nextInt();
				double b = cin.nextDouble();
				int t = cin.nextInt();
				bank[i]=new Bank(a,b,t);
				bank[i].calc(y);
				//System.out.println(bank[i].money);
				
			}
			Arrays.sort(bank);
			System.out.println(bank[bank.length-1].b);
		}
		
	}

}
class Bank implements Comparable{
	double money;
	int b;
	double r;
	int type;
	public int compareTo(Object o){
		Bank b = (Bank)o;
		if(this.money>b.money){
			return 1;
		}
		else if(this.money==b.money){
			return 0;
		}
		else{
			return -1;
		}
	}
	Bank(int a,double d,int x){
		b=a;
		r=d;
		type=x;
	}
	void calc(int year){
		money=1;
		if(type==2){
			money = money*Math.pow((1.0+r/100),year);
		}
		else{
			money= money*(1.0+year*(r/100));
		}
	}
}