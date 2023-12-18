import java.util.Scanner;
class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));
	}
	static int gcd(int x, int y){
		int c = 1;
		int gcd = 0;
		while(c <= y){
			if(x % c == 0 && y % c == 0){
				gcd = c;
			}
			c++;
		}
		return gcd;
	}
}