import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if((n|m)==0){
				return;
			}
			int[] invite = new int[n+1];
			int[][] friend = new int[m][2];
			for(int i=0;i<m;i++){
				friend[i][0] = stdIn.nextInt();
				friend[i][1] = stdIn.nextInt();
			}
			for(int i=0;i<m;i++){
				if(friend[i][0]==1||friend[i][1]==1){
					invite[friend[i][0]] = 1;
					invite[friend[i][1]] = 1;
				}
			}
			for(int i=0;i<m;i++){
				if(invite[friend[i][0]]==1&&invite[friend[i][1]]==0){
					invite[friend[i][1]] = 2;
				}
				if(invite[friend[i][1]]==1&&invite[friend[i][0]]==0){
					invite[friend[i][1]] = 2;
				}
			}
			int cnt = 0;
			for(int i=2;i<=n;i++){
				if(invite[i]>0){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}