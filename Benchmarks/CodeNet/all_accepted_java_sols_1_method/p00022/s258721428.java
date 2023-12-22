import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] result = new int[10000];
		int index = 0;
		int n = stdIn.nextInt();
		while( n != 0 ){
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = stdIn.nextInt();
			}
			
			int max = a[0];
			for(int i = 0; i < n; i++){
				int sum = 0;
				for(int j = i; j < n; j++){
					sum += a[j];
					if( sum > max ){
						max = sum;
					}
				}
			}
			result[index] = max;
			index++;
			n = stdIn.nextInt();
		}
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}