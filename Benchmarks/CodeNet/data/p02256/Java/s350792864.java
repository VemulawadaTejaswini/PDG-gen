import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if(x==y) {
			System.out.println(x);
		}else if(x>y){
			System.out.println(divisor(x,y));
		}else {
			System.out.println(divisor(y,x));
		}

	}

	public static int divisor(int x,int y) {
		int temp=0;

		temp = x%y;
		if(temp==0) {
			return y;
		}
		return divisor(y,temp);
	}
}

