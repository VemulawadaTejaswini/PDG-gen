import java.util.Scanner;

class Main{

	public static void main(String[] args){

		Scanner sc =new Scanner(System.in);

		int x=sc.nextInt();
		int y=sc.nextInt();

		System.out.println(gcd(x,y));

	}

	private static int gcd(int x, int y) {

		if(x%y==0) return y;
		else return gcd(y,x%y);

	}


}

