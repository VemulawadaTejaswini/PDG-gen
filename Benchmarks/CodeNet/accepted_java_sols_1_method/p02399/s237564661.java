import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if( (1<=a) && (b<=1000000000) ){
			System.out.printf("%d %d %f", a/b, a%b, (double)a/b);
		}
	}
}