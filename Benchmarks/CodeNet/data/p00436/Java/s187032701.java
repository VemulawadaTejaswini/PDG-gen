import java.util.Scanner;

public class Main{
		
	public static int[] cut(int[] a, int k){
		int[] result = new int[a.length];
		if( k == 0 ){
			for(int i = 0; i < a.length/2; i++){
				result[2*i] = a[i];
			}
			for(int i = a.length/2; i < a.length; i++){
				result[(i-a.length/2)*2+1] = a[i];
			}
		} else {
			for(int i = k; i < a.length; i++){
				result[i-k] = a[i];
			}
			for(int i = 0; i < k; i++){
				result[a.length-k+i] = a[i];
			}
		}
		return result;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] deck = new int[2*n];
		for(int i = 0; i < 2*n; i++){
			deck[i] = i+1;
		}
		
		int m = stdIn.nextInt();
		int[] op = new int[m];
		
		for(int i = 0; i < m; i++){
			op[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < m; i++){
			deck = 	cut(deck, op[i]);
		}
		for(int i = 0; i < 2*n; i++){
			System.out.println(deck[i]);
		}
	}
}