import java.util.Scanner;
class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(gcd(x,y));
	}
	static int gcd(int x, int y){
		if(y == 0){
			return x;
		}else{
			return gcd(y, x % y);
		}
	}
}