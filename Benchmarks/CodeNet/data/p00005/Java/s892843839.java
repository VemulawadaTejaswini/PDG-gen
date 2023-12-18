import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
		sc.close();
	}
	
	static int gcd(long a,long b){	//最大公約数
		if(a<b) return gcd(b,a);	//入れ換えて再実行
		long d=0;
		do{
			d=a%b;
			a=b;
			b=d;
		}while(d!=0);
		return (int)a;
	}

	static int lcm(long a,long b){	//最小公倍数
		return (int)(a*b/gcd(a,b));
	}
}