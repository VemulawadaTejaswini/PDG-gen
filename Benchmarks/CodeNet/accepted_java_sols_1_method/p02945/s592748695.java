import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int sum = A+B;
		if(sum>max) max = sum;
		int red = A-B;
		if(red > max) max = red;
		int d = A*B;
		if(d > max) max = d;
		System.out.println(max);
	}
}
