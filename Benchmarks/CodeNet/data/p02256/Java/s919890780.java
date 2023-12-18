import java.util.Scanner;
public class Main {
	static int gcd(int a,int b){
		if(b==0){
			return a;
		}else{
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(gcd(Math.max(a,b),Math.min(a,b)));
		scan.close();
	}
}