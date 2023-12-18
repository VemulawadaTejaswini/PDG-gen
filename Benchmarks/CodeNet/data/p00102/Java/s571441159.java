import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args)throws IOException{
		Scanner scan=new Scanner(System.in);
		int n;
		while((n=scan.nextInt())!=0){
			int[][] vec=new int[n+1][n+1];
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					int temp;
					temp=vec[i][j]=scan.nextInt();
					vec[n][j]+=temp;
					vec[i][n]+=temp;
				}
			}
			for(int i=0;i<n;i++){
				vec[n][n]+=vec[i][n];
			}
			for(int i=0;i<vec.length;i++){
				System.out.printf("%d",vec[i][0]);
				for(int j=1;j<vec[i].length;j++){
					System.out.printf(" %d",vec[i][j]);
				}
				System.out.println();
			}
		}
	}
}