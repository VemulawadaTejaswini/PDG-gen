import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){		
			int N = scan.nextInt();//スイッチの個数
			int M= scan.nextInt();//ｍ個の電球
			
			int[]k = new int[M];
			int[][]s = new int[M][N];
			
			for(int i = 0;i<M;i++) {
				k[i]  =scan.nextInt();
				for(int j =0;j<k[i];j++) {
					s[i][j] = scan.nextInt();
				}
			}
			int[]p = new int[M];//０or1
			
			for(int i = 0;i<M;i++) {
				p[i] =scan.nextInt();
			}
			
			int[] sw = new int[N];
			int dennkyugatukutouri = 0;
			for(int i = 0;i<(int)Math.pow(2, N);i++) {	
				for(int j = 0;j<N;j++) {
					if((1&i>>j)==1) 
						sw[j] = 1;
					else
						sw[j] = 0;
				}
				
				int hikarukosuu = 0;
				for(int z = 0;z<M;z++) {
					int onkosuu = 0;
					for(int w = 0;w<k[z];w++) {
						if(sw[s[z][w]-1]==1) {
							onkosuu++;
						}
					}
					if(onkosuu%2==p[z]) {
						hikarukosuu++;
					}
				}
				
				if(hikarukosuu==M) {
					dennkyugatukutouri++;
				}
				
				
			}
			
			
			System.out.println(dennkyugatukutouri);
			
			
			
		}
		
		
	}
		
	

}