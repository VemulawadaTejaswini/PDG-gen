import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long array[] = new long[n];
		long sum = 0;
		for(int i=0;i<n;i++){
			array[i] = sc.nextLong();
			sum += array[i];
		}
		long x = 0;
		for(int i=0;i<n;i++){
			sum -= array[i];
			x += array[i] * (sum % (Math.pow(10,9) + 7));
			x %= (long)(Math.pow(10,9) + 7);
		}
		System.out.println(x % (long)(Math.pow(10,9) + 7));
		sc.close();
	}
}
