import java.util.Scanner;

public class Main {

	static int[][] a;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N =cin.nextInt();
		int count=1;
		while(N--!=0){
			a = new int[10][10];
			for(int i = 1; i <= 8;i++){
				String str = cin.next();
				for(int j = 1; j <= 8;j++){
					a[i][j]=str.charAt(j-1)-'0'+1;
				}
			}
			int x = cin.nextInt();
			int y = cin.nextInt();
			bomb(y, x);
			System.out.println("Data "+(count++)+":");
			for(int i = 1;i<=8;i++){
				for(int j = 1;j<=8;j++){
					System.out.print(a[i][j]-1);
				}
				System.out.println();
			}
		}
	}
	static void bomb(int x, int y){
		a[x][y]=1;
		for(int i = 1; i <= 3;i++){
			if(a[x+i][y]==2){
				bomb(x+i,y);
			}
			else if(a[x+i][y]==0){
				break;
			}
		}
		for(int i = 1; i <= 3;i++){
			if(a[x-i][y]==2){
				bomb(x-i,y);
			}
			else if(a[x-i][y]==0){
				break;
			}
		}
		for(int i = 1; i <= 3;i++){
			if(a[x][y+i]==2){
				bomb(x,y+i);
			}
			else if(a[x][y+i]==0){
				break;
			}
		}
		for(int i = 1; i <= 3;i++){
			if(a[x][y-i]==2){
				bomb(x,y-i);
			}
			else if(a[x][y-i]==0){
				break;
			}
		}
	}
}