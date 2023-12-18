import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(360 / gcd(x, 360));
	}
	public static int gcd(int num1,int num2) {
        if(num2 == 0) return num1;
        else return gcd(num2 , num1 % num2 );
    }


}

