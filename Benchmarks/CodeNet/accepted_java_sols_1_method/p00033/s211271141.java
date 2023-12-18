import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] a = new int[n][10];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < 10;j++){
				a[i][j] = scan.nextInt();
			}
		}
		for(int i = 0;i < n;i++){
			int minb = 0;
			int minc = 0;
			boolean flag = true;
			for(int j = 0;j < 10;j++){
				if(minb == 0 && minc == 0){
					minb = a[i][j];
				}else if(minb < a[i][j] && minc < a[i][j]){
					minb = a[i][j];
				}else if(minb < a[i][j]){
					minb = a[i][j];
				}else if(minc < a[i][j]){
					minc = a[i][j];
				}else{
					flag = false;
					break;
				}
			}
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}