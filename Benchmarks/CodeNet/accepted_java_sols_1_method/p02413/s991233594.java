import java.util.Scanner;
class Main{
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int r,c;
		int[][] spread=new int[101][101];
		for(int i=0;i<101;i++){
			for(int j=0;j<101;j++){
				spread[i][j]=0;
			}
		}
		r=sc.nextInt();
		c=sc.nextInt();
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				spread[i][j]=sc.nextInt();
				spread[r][j]+=spread[i][j];
				spread[i][c]+=spread[i][j];
				System.out.print(spread[i][j]+" ");
			}
			System.out.println(spread[i][c]);
			spread[r][c]+=spread[i][c];
		}
		for(int j=0;j<c;j++){
			System.out.print(spread[r][j]+" ");
		}
		System.out.println(spread[r][c]);
    }
}

