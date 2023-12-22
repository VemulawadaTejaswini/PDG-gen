import java.util.Scanner;
import java.util.Arrays;

class Main {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int[] x = new int[10];
		
		int i;
		for(i = 0; i < 10; i++){
			x[i] = cin.nextInt();
		}
		
		Arrays.sort(x);
		
		for  (i = 9; i > 6; i--){
			System.out.println(x[i]);
		}
	}
}