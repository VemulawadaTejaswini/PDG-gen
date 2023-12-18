import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sca=new Scanner(System.in);
		int x = sca.nextInt();
		int y = sca.nextInt();
		System.out.println(gcd(x,y));
	}
	public static int gcd(int x, int y){
	    if(x<y){
			int r = x;
			x = y;
			y = r;
		}
		while(x%y != 0){
			int r = x%y;
			x=y;
			y=r;
		}
		return y;
	}
}
