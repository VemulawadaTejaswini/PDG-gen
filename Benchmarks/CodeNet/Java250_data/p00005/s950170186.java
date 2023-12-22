import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int gcd(int a, int b){
		if(b == 0) return a;
		return gcd(b,a % b);
    }
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			try{
				int a = in.nextInt();
				int b = in.nextInt();
				int min = gcd(a,b);
				int max = 1;
				for(int i = 2;i < Math.pow(a + b, 0.5) + 1;i++){
					if(a % i == 0 && b % i == 0){
						max = max * i;
						a = a / i;
						b = b / i;
						i--;
					}
				}
				max = max * a * b;
				System.out.println(min + " " + max);
			}catch(Exception e){
				System.exit(0);
			}
		}
	}
}