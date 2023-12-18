import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int H = sc.nextInt();
		int W = sc.nextInt();

		String A[][] = new String[H][W];
		for(int i = 0;i < H;i++){
			String IN = sc.next();
			for(int j= 0;j < W;j++){
				A[i][j] = IN.substring(j, j+1); 
			}
		}
		
		for(int i = 0;i < H;i++){
			int cnt = 0;
			for(int j = 0;j < W;j++){
				if(A[i][j].equals(".")){
					cnt ++;
				}
			}
			if(cnt == W){
				H --;
				for(int k = i;k < H;k++){
					for(int j = 0;j < W;j++){
						A[k][j] = A[k+1][j];
					}
				}
				i --;
			}
		}

		for(int j = 0;j < W;j++){
			int cnt = 0;
			for(int i = 0;i < H;i++){
				if(A[i][j].equals(".")){
					cnt ++;
				}
			}
			if(cnt == H){
				W --;
				for(int k = j;k < W;k++){
					for(int i = 0;i < H;i++){
						A[i][k] = A[i][k+1];
					}
				}
				j --;
			}
		}

		for(int i = 0;i < H;i++){
			String ans = "";
			for(int j = 0;j < W;j++){
				ans = ans + A[i][j]; 
			}
			System.out.println(ans);
		}
		
   		sc.close();
        return ;

    }
    
}

