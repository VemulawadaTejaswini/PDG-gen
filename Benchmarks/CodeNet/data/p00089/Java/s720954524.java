import java.util.*;
public class Main {
	static void print(int[][] a){
		for(int s=0;s<9;s++){
			for(int i=0;i<5;i++)if(a[s][i]!=-1)System.out.print(a[s][i]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		//右か下に行ける最大値
		int[][] input = new int[10][10];
		int[][] dp = new int[5][5];
		for(int s=0;s<10;s++)for(int i=0;i<10;i++)input[s][i]=-1;
		for(int s=0;s<9;s++){
			String[] a= in.next().split(",");
			for(int i=0;i<a.length;i++)input[s][i]=Integer.parseInt(a[i]);
		}
		
		for(int s=1;s<5;s++){
			for(int i=0;i<10;i++){
				if(input[s][i]==-1)break;
				int x=i,y=s-1;
				int max=0;
				if(y>=0||x>=0)max = input[y][x];
				if((x-1)>=0)max=Math.max(max,input[y][x-1]);
				input[s][i]+=max;
			}
		}
		for(int s=5;s<9;s++){
			for(int i=0;i<10;i++){
				if(input[s][i]==-1)break;
				int x=i,y=s-1;
				int max=0;
				if(y>=0||x>=0)max = input[y][x];
				if((x+1)>=0)max=Math.max(max,input[y][x+1]);
				input[s][i]+=max;
			}
		}
		System.out.println(input[8][0]);
	}
}