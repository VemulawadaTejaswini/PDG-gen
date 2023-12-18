import java.util.Scanner;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long array[] = new long[n];
		for(int i=0;i<n;i++){
			array[i] = sc.nextLong();
			array[i] %= (Math.pow(10,9)+7);
		}
		long x = 0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				x += (array[i] * array[j]) % (Math.pow(10,9)+7);
				x %= (Math.pow(10,9)+7);
			}
		}
		System.out.println(x);
		sc.close();
	}
}
