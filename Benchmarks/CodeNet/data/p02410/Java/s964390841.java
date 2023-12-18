import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int[] c = new int[100];
		
		for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
			a[i][j] = scan.nextInt();}}
			
		for(int j=0; j<m; j++){
			b[j] = scan.nextInt();}
			
		for(int i=0; i<n; i++){
		for(int j=0; j<m; j++){
			c[i] += a[i][j] * b[j];}
			System.out.println(c[i]);}
	}
}
