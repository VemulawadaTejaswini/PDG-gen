import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][3] ;
		int sum[] = new int[n];
		int cnt = 0;
		//-------------??´??°??\???------------------
		for(int i = 0; i < n; i++){
			for(int k = 0; k < 3; k++){
				a[i][k] = sc.nextInt();
			}
		}
		//----------------?????????---------------
		for(int i = 0; i < 3; i++){
			for(int k = 0; k < n; k++){
				for(int j = 0; j < n; j++){
					if(a[k][i] == a[j][i]){
						cnt++;
					}
				}
				if(cnt == 1){
					sum[k] += a[k][i];
				}
				cnt = 0;
			}
		}
		//---------------??????--------------------
		for(int i = 0; i < n; i++){
			System.out.println(sum[i]);
		}
	}

}