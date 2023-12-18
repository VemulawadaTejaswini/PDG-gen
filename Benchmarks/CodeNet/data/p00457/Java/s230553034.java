import java.util.Scanner;

public class Main{
	public static int[] copy(int[] a){
		int[] result = new int[a.length];
		for(int i = 0; i < a.length; i++){
			result[i] = a[i];
		}
		return result;
	}
	 
	public static int[] arrange(int[] a, int start, int end){
		int[] result = new int[a.length+start-end];
		for(int i = 0; i < start; i++){
			result[i] = a[i];
		}
		for(int i = start; i < result.length; i++){
			result[i] = a[i+end-start];
		}
		return result;
	}
		
	public static int[] vanish(int[] a){
		int key = a[0];
		int count = 1;
		for(int i = 1; i < a.length; i++){
			if( a[i] == key ){
				count++;
			} else {
				key = a[i];
				if( count >= 4 ){
					a = arrange(a, i-count, i);
					i = 1;
					key = a[0];
				}
				count = 1;
			}
		}
		return a;
	}
	
	public static int solve(int[] a){
		int[] x = copy(a);
		x[0] = x[1];
		x = vanish(x);
		int min = x.length;
		for(int i = 1; i < a.length-1; i++){		
			if( a[i] != a[i-1] || a[i] != a[i+1] ){
				if( a[i] != a[i-1] ){
					int[] y = copy(a);
					y[i] = y[i-1];
					y = vanish(y);
					if( y.length < min ){
						min = y.length;
					}
				} 
				if( a[i] != a[i+1] ){
					int[] y = copy(a);
					y[i] = y[i+1];
					y = vanish(y);
					if( y.length < min ){
						min = y.length;
					}
				}
			}
		}
		x = copy(a);
		x[x.length-2] = x[x.length-1];
		x = vanish(x);
		if( x.length < min ){
			min = x.length;
		}
		
		return min;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int[] M = new int[100];
		int N = stdIn.nextInt();
		int index = 0;
		while( N != 0 ){
			int[] c = new int[N];
			for(int i = 0; i < N; i++){
				c[i] = stdIn.nextInt();
			}
			M[index] = solve(c);
			index++;
			N = stdIn.nextInt();
		}
		
		for(int i = 0; i < index; i++){
			System.out.println(M[i]);
		}
	}
}