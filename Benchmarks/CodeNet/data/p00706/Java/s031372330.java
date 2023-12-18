import java.util.Scanner;

public class Main {

	static int n,w,h,s,t;
	static int[][] persimmon;
	static int[][] field,row;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			if(n==0){
				break;
			}
			w=cin.nextInt();
			h=cin.nextInt();
			persimmon=new int[n][2];
			field=new int[h+1][w+1];
			row=new int[h+1][w+1];
			for(int i =0;i<n;i++){
				int x=cin.nextInt();
				int y=cin.nextInt();
				field[y][x]=1;
			}
			s=cin.nextInt();
			t=cin.nextInt();

			for(int i = 1;i<=h;i++){
				for(int j = 1;j<=w;j++){
					row[i][j]=field[i][j]+row[i][j-1];
				}
			}
			for(int i = 1;i<=h;i++){
				for(int j = 1;j<=w;j++){
					//System.out.print(row[i][j]+" ");
				}
				//System.out.println();
			}
			int max=0;
			for(int i = 1;i+t<=h;i++){
				for(int j = 1;j+s<=w;j++){
					int sum=0;
					for(int k = 0;k<t;k++){
						sum+=row[i+k][j+s]-row[i+k][j-1];
					}
					max=Math.max(max,sum);
				}
			}
			System.out.println(max);
			
		}
	}

}