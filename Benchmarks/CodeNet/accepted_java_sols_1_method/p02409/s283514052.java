import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[][][] a = new int[5][4][11];
		
		for(int i=1; i<=4; i++){
		for(int j=1; j<=3; j++){
		for(int q=1; q<=10; q++){
			a[i][j][q] = 0;}}}
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++){
			int b = scan.nextInt();
			int f = scan.nextInt();
			int r = scan.nextInt();
			int v = scan.nextInt();
			
			a[b][f][r] += v;}
			
		for(int i=1; i<=4; i++){
		for(int j=1; j<=3; j++){
		for(int q=1; q<=10; q++){
			System.out.print(" "+a[i][j][q]);}
			System.out.print("\n");}
			if(i!=4){
			System.out.println("####################");}}
	}
}
