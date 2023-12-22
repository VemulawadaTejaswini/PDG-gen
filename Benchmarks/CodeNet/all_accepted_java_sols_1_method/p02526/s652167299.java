import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] S = new int[n];
		for( int i = 0; i < n; i++ ){
			S[i] = Integer.parseInt(scan.next());
		}
		int q = Integer.parseInt(scan.next());
		int[] T = new int[q];
		for( int i = 0; i < q; i++ ){
			T[i] = Integer.parseInt(scan.next());
		}
		int count = 0;
		for( int i = 0; i < q; i++ ){
			for( int j = 0; j < n; j++ ){
				if( T[i] == S[j] ){
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		return;
	}
}