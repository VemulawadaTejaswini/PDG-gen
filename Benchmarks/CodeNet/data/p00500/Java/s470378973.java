import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int member = in.nextInt();
		int sum,cnt = 0;
		int[][] num = new int [member][3];
		for(int i = 0;i < member;i++){
			for(int j = 0;j < 3;j++){
				num[i][j] = in.nextInt();
			}
		}
		for(int k = 0;k < 3;k++){
			for(int i = 0;i < member;i++){
				for(int j = 0;j < member;j++){
					if(i == j){
						if(j == member-1)break;
						else j++;
					}
					if(num[i][k] == num[j][k]){
						num[j][k] = 0;
						cnt++;
					}
				}
				if(cnt > 0)num[i][k] = 0;
				cnt = 0;
			}
		}
		for(int i = 0;i < member;i++){
			sum = num[i][0] + num[i][1] + num[i][2];
			System.out.println(sum);
		}
	}
}