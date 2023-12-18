import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int m = scan.nextInt();
			int[][] cost = new int[n][n];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					cost[i][j] = Integer.MAX_VALUE;
				}
			}
			for(int i = 0;i < m;i++){
				String[] str = scan.next().split(",");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				int c = Integer.parseInt(str[2]);
				cost[a][b] = c;
				cost[b][a] = c;
			}
			int count = 0;
			int min = 0;
			for(int i = 1;i < n;i++){
				min = cost[0][i];
				for(int j = 0;j < i;j++){
					min = (min > cost[j][i])?cost[j][i]:min;
				}
				count += min/100 - 1;
			}
			System.out.println(count);
		}
	}
}