import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int sum = 0;
		
		sum += a;
		if(sum > k){
			sum = k;
			k = 0;
		} else {
			k = k - a - b;
		}
		if(k < 0) k = 0;
		sum -= k;
		
		System.out.println(sum);
	}
}