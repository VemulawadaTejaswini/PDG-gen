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
			int flag = 0;
			int min = 0;
			for(int j = 0;j < 9;j++){
				if(a[i][j] > a[i][j+1]){
					if(min == 0){
						min = a[i][j+1];
					}else if(min > a[i][j+1]){
						flag++;
					}else{
						min = a[i][j+1];
					}
				}
				if(flag > 2){
					System.out.println("NO");
					break;
				}
			}
			if(flag < 3){
				System.out.println("YES");
			}
		}
	}
}