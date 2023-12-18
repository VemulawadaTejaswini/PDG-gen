import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[][] ab=new int[a+1][b+1];
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++)
				ab[i][j]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				ab[i][b]=ab[i][b]+ab[i][j];
				ab[a][j]=ab[a][j]+ab[i][j];
			}
			ab[a][b]=ab[a][b]+ab[i][b];
		}
		for(int i=0;i<=a;i++){
			for(int j=0;j<=b;j++){
				if(j==b){
					System.out.print(ab[i][j]);
					System.out.print("\n");
				}else
					System.out.print(ab[i][j]+" ");
			}
		}
	}
}

