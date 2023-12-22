import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] t = new int[N][3];
		int tmp;
		for(int i=0;i<N;i++){
			for(int j=0;j<3;j++){
				t[i][j] = sc.nextInt();
				if(j==1&&t[i][0]>t[i][1]){
					tmp = t[i][0];
					t[i][0] = t[i][1];
					t[i][1] = tmp;
				}
				if(j==2&&t[i][1]>t[i][2]){
					tmp = t[i][1];
					t[i][1] = t[i][2];
					t[i][2] = tmp;
				}
			}
		}
		for(int i=0;i<N;i++){
			if(t[i][0]*t[i][0]+t[i][1]*t[i][1]==t[i][2]*t[i][2]){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
		
	}
}