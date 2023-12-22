import java.util.Scanner;
class Main{
	public static void main(String args[]){
		int i,j,g,r,x;
		Scanner sc = new Scanner(System.in);
		g=sc.nextInt();
		r=sc.nextInt();
		int[][] map= new int[g+1][r+1];
		for(i=0;i<g+1;i++){
			for(j=0;j<r+1;j++)
			map[i][j]=0;
		}
		for(i=0;i<g;i++){
			for(j=0;j<r;j++)
				map[i][j]=sc.nextInt();
		}
		for(i=0;i<g;i++){
			for(j=0;j<r;j++){
				map[i][r]+=map[i][j];
				map[g][j]+=map[i][j];}
			map[g][r]+=map[i][r];
		}
		for(i=0;i<g+1;i++){
			for(j=0;j<r;j++)
				System.out.print(map[i][j]+" ");
			System.out.println(map[i][r]);
		}
	}
}
