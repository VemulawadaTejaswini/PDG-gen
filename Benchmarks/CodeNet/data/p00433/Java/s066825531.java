import java.util.Scanner;

public class Main{
	public static int sumUp(int[] a ){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		return sum;
	}
	
	public static int max(int a, int b){
		return ( a > b ) ? a : b;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[4];
		
		for(int i = 0; i < 4; i++){
			a[i] = stdIn.nextInt();
		}
		for(int i = 0; i < 4; i++){
			b[i] = stdIn.nextInt();
		}
		
		System.out.println(max(sumUp(a), sumUp(b)));
	}
}