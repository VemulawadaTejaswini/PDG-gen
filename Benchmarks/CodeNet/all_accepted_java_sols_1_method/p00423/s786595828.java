import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
				
		int[][] p = new int[1000][2];
		int index = 0;
		while( n != 0 ){
			int[] a = new int[n];    // Point of A
			int[] b = new int[n];    // Point of B
			for(int i = 0; i < n; i++){
				a[i] = stdIn.nextInt();
				b[i] = stdIn.nextInt();
				if( a[i] > b[i] ){
					p[index][0] += (a[i] + b[i]);
				} else if( a[i] < b[i] ){
					p[index][1] += (a[i] + b[i]);
				} else {
					p[index][0] += a[i];
					p[index][1] += b[i];
				}
			}
			index++;
			n = stdIn.nextInt();			
		}
		
		for(int i = 0; i < index; i++){
			System.out.println(p[i][0] + " " + p[i][1]);
		}
	}
}