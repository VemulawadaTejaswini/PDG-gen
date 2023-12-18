import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int N = scan.nextInt();
			int M = scan.nextInt();
			if(N==0&&M==0){
				break;
			}
			int r = scan.nextInt();
			int[][] data = new int[r][4];
			for(int i=0;i<r;++i){
				data[i][0]=scan.nextInt();
				data[i][1]=scan.nextInt();
				data[i][2]=scan.nextInt();
				data[i][3]=scan.nextInt();
			}
			int q=scan.nextInt();
			for(int i=0; i<q; i++){
				int start=scan.nextInt();
				int end=scan.nextInt();
				int m=scan.nextInt();
				System.out.println(cul(data,start,end,m,r));
			}
		}
	}
	
	public static int cul(int[][] data, int start, int end, int m, int r){
		int[] time = new int[720];
		for(int i=0;i<r;++i){
			if(data[i][2]==m){
				if(data[i][3]==1){
					time[data[i][0]-540]=1;
				} else {
					time[data[i][0]-540]=-1;
				}
			}
		}
		for(int i=1;i<720;++i){
			time[i]=time[i]+time[i-1];
		}
		int ans=0;
		start-=540; end-=540;
		for(int i=start;i<end;++i){
			if(time[i]>0){
				ans++;
			}
		}
		return ans;
	}
}