import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int i,j,k,b;
		String ans = "No";
		for(i = 0;i < 3;i++){
			for(j = 0;j < 3;j++){
				a[i][j] = sc.nextInt();
			}
		}
		int N = sc.nextInt();
		for(i = 0;i < N;i++){
			b = sc.nextInt();
			for(j = 0;j < 3;j++){
				for(k = 0;k < 3;k++){
					if(a[j][k] == b){
						a[j][k] = 0;
					}
				}
			}
		}
		if((a[0][0] + a[1][1] + a[2][2]) == 0 || (a[0][2] + a[1][1] + a[2][0]) == 0){
			ans = "Yes";
		}else{
			for(i = 0;i < 3;i++){
				if((a[i][0] + a[i][1] + a[i][2]) == 0 || (a[0][i] + a[1][i] + a[2][i]) == 0 ){
					ans = "Yes";
					break;
				}else{
				ans = "No";
				}
			}
		}
		System.out.println(ans);
	}
}