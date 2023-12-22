import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int m[][]=new int[r+1][c+1];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				m[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(m[i][j]+" ");
				m[i][c]+=m[i][j];
			}
			System.out.println(m[i][c]);
		}
		for(int j=0;j<c+1;j++){
			for(int i=0;i<r;i++){
				m[r][j]+=m[i][j];
			}
			System.out.print(m[r][j]);
			if(j!=c)System.out.print(" ");
		}
		System.out.println();
	}
}