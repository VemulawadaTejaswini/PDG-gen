import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc;
	
	void solve(int n){
		int[][] square=new int[n][n];
		for(int i=0;i<n;++i)Arrays.fill(square[i],0);
		int i=n/2+1,j=n/2,k=1;
		
		while(k<=n*n){
			if(j>=n){j=0;}
			else if(j<0){j=n-1;}
			
			if(i>=n){i=0;}
			if(square[i][j]!=0){++i;--j;continue;}
			square[i++][j++]=k++;
		}
		for(int r=0;r<n;++r){
			for(int c=0;c<n;++c){
				System.out.format("%4d",square[r][c]);
			}
			System.out.println();
		}
	}
	
	void io(){
		int n;
		sc=new Scanner(System.in);
		while((n=sc.nextInt())!=0){
			solve(n);
		}
	}

	public static void main(String[] args) {
		new Main().io();
	}

}