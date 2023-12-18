import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int[][] input = new int[n-1][2];
			int[][] map = new int[n][4];
			for(int i=0;i<n;++i){
				for(int j=0;j<4;++j){
					map[i][j]=-1;
				}
			}
			int[] change = {2,3,0,1};
			for(int i=0;i<n-1;++i){
				input[i][0]=sc.nextInt();
				input[i][1]=sc.nextInt();
				map[input[i][0]][input[i][1]]=i+1;
				map[i+1][change[input[i][1]]]=input[i][0];
			}
			int top=0,under=0,left=0,right=0;
			for(int i=0;i<n;++i){
				int count=1;
				if(map[i][0]!=-1){
					int j=map[i][0]; count++;
					while(map[j][0]!=-1){
						j=map[j][0]; count++;
					}
				}
				if(left<count) left=count;
				count=1;
				if(map[i][1]!=-1){
					int j=map[i][1]; count++;
					while(map[j][1]!=-1){
						j=map[j][1]; count++;
					}
				}
				if(under<count) under=count;
				count=1;
				if(map[i][2]!=-1){
					int j=map[i][2]; count++;
					while(map[j][2]!=-1){
						j=map[j][2]; count++;
					}
				}
				if(right<count) right=count;
				count=1;
				if(map[i][3]!=-1){
					int j=map[i][3]; count++;
					while(map[j][3]!=-1){
						j=map[j][3]; count++;
					}
				}
				if(top<count) top=count;
			}
			int[] result=new int[2];
			result[0]=Integer.max(left, right);
			result[1]=Integer.min(top, under);
			System.out.println(result[0]+" "+result[1]);
		}
	}
}

