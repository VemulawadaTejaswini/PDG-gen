import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			int[][] input = new int[n-1][2];
			int[] data = {-1,-1,1,1};
			int[][] map = new int[n][2];
			int xmin=0,xmax=0,ymin=0,ymax=0;
			for(int i=0;i<n-1;++i){
				input[i][0]=sc.nextInt();
				input[i][1]=sc.nextInt();
				if(input[i][1]==0){
					map[i+1][0]=map[input[i][0]][0]+data[input[i][1]];
					map[i+1][1]=map[input[i][0]][1];
				}
				else if(input[i][1]==1){
					map[i+1][0]=map[input[i][0]][0];
					map[i+1][1]=map[input[i][0]][1]+data[input[i][1]];
				}
				else if(input[i][1]==2){
					map[i+1][0]=map[input[i][0]][0]+data[input[i][1]];
					map[i+1][1]=map[input[i][0]][1];
				}
				else{
					map[i+1][0]=map[input[i][0]][0];
					map[i+1][1]=map[input[i][0]][1]+data[input[i][1]];
				}
				if(xmin>map[i+1][0]) xmin=map[i+1][0];
				if(xmax<map[i+1][0]) xmax=map[i+1][0];
				if(ymin>map[i+1][1]) ymin=map[i+1][1];
				if(ymax<map[i+1][1]) ymax=map[i+1][1];
			}
			System.out.println((xmax-xmin+1)+" "+(ymax-ymin+1));
		}
	}
}

