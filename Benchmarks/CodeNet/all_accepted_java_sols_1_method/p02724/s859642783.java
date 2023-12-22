import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int a = n / 500;
		sum += a * 1000;
		n = n - a * 500;
		int b = n / 5;
		sum += b * 5;
		System.out.println(sum);
	}
	
	}