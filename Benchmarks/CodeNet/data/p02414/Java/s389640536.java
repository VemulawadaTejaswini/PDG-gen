import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long[][] a = new long[100][100];
		long[][] b = new long[100][100];
		long[][] c = new long[100][100];
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int l = scan.nextInt();
		
		for(int i=0; i<n; i++){
		for(int j=0; j<l; j++){
			c[i][j] = 0;}}
		
		for(int i=0; i<n; i++){
		for(int k=0; k<m; k++){
			a[i][k] = scan.nextLong();}}
		
		for(int k=0; k<m; k++){
		for(int j=0; j<l; j++){
			b[k][j] = scan.nextLong();}}
			
		for(int i=0; i<n; i++){
		for(int j=0; j<l; j++){
		for(int k=0; k<m; k++){
			c[i][j] += a[i][k] * b[k][j];}}}
			
		for(int i=0; i<n; i++){
		for(int j=0; j<l; j++){
			System.out.print(c[i][j]);
			if(j!=l-1){
				System.out.print(" ");}}
			System.out.print("\n");}
	}
}
