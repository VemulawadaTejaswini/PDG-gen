import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		while(N != 1){
			N /= 2;
			count++;
		}
		System.out.println(pow(count));
	}
	
	static int pow(int n){
		int pow = 1;
		for(int idx = 0; idx < n; idx++)
			pow *= 2;
		return pow;
	}
}