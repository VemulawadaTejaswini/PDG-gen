import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
		long result = 0;
		if(k >= a){
			result += a;
			if(k > a + b){
				result -= k - a - b;
			}
		}else{
			result += k;
		}
		System.out.println(result);
	}
}
