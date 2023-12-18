import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>=y){
			System.out.println(solve(x,y));
		}else{
			System.out.println(solve(y,x));
		}
	}

	static int solve(int x,int y){//x>y
		int a=x%y;
		return gcd(x,a);


	}
	static int gcd(int x,int y){
		int r=0;
		while(x%y!=0){
			r=x%y;
			x=y;
			y=r;
		}
		return y;
	}

	}
