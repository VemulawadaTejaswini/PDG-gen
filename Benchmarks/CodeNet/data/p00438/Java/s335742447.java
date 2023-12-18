import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == 0 && b == 0){
				break;
			}
			int n = scan.nextInt();
			int[][] route = new int[a][b];
			for(int i = 0;i < a;i++){
				for(int j = 0;j < b;j++){
					if(i == 0 && j == 0){
						route[i][j] = 1;
					}else{
						route[i][j] = -1;
					}
				}
			}
			for(int i = 0;i < n;i++){
				route[scan.nextInt()-1][scan.nextInt()-1] = 0;
			}
			for(int i = 0;i < a;i++){
				for(int j = 0;j < b;j++){
					if(route[i][j] < 0){
						if(i == 0){
							route[i][j] = route[i][j-1];
						}else if(j == 0){
							route[i][j] = route[i-1][j];
						}else{
							route[i][j] = route[i-1][j] + route[i][j-1];
						}
					}
				}
			}
			System.out.println(route[a-1][b-1]);
		}
	}
}