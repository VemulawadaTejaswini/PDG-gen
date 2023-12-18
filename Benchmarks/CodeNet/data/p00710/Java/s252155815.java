import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while( true ){
			int n = Integer.parseInt(scan.next());
			int r = Integer.parseInt(scan.next());
			int[] num = new int[n];
			for( int i = 0; i < n; i++ ){
				num[i] = n - i;
			}
			if( n == 0 && r == 0 ){
				break;
			}
			for( int i = 0; i < r; i++ ){
				int p = Integer.parseInt(scan.next());
				int c = Integer.parseInt(scan.next());
				Func(num, n, p, c);
			}
			for( int i = 0; i < n; i++ ){
			}
			System.out.println(num[0]);
		}
		return;
	}
	
	public static void Func(int[] num, int n, int p, int c){
		int[] n1 = new int[p-1];
		int[] n2 = new int[c];
		int[] n3 = new int[n-p+1-c];
		for( int i = 0; i < p - 1; i++ ){
			n1[i] = num[i];
		}
		for( int i = 0; i < c; i++ ){
			n2[i] = num[i+p-1];
		}
		for( int i = 0; i < n-p+1-c; i++ ){
			n3[i] = num[i+n-p+2-c];
		}
		
		for( int i = 0; i < c; i++ ){
			num[i] = n2[i];
		}
		for( int i = 0; i < p - 1; i++ ){
			num[i + c] = n1[i];
		}
		for( int i = 0; i < n-p+1-c; i++ ){
			num[c+p-1+i] = n3[i];
		}
		return;
	}
}