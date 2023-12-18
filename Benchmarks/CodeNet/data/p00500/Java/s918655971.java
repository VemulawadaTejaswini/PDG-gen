import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		int point[][] = new int[n][3];
		int sum[] = new int[n];
		for(int i = 0;i < n;i++){
			for(int k = 0;k < 3;k++){
				point[i][k] = sc.nextInt();
			}
			sum[i] = 0;
		}
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < n;j++){
				cnt = 0;
				for(int k = 0;k < n;k++){
					if(point[j][i] == point[k][i]) cnt++;
				}
				if(cnt == 1) sum[j] += point[j][i];
			}
		}
		for(int i = 0;i < n;i++){
			System.out.println(sum[i]);
		}
	}
}