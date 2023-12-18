import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int DP(int h,int w,int hw[][]){
		int result = 0;
		int yx[][] = new int [h][w];
		for(int i = 0;i < w;i++){
			if(hw[0][i] == 0){
				yx[0][i] = 1;
			}
		}
		for(int i = 0;i < h-1;i++){
			for(int j = 0;j < w;j++){
				if(j == 0){
					if(hw[i+1][j] == 0){
						if(w == 1){
							yx[i+1][j] = yx[i+1][j] + yx[i][j];
							break;
						}else{
							yx[i+1][j] = yx[i+1][j] + yx[i][j] + yx[i][j+1];
						}
					}
				}else if(j == w-1){
					if(hw[i+1][j] == 0){
						yx[i+1][j] = yx[i+1][j] + yx[i][j] + yx[i][j-1];
					}
				}else{
					if(hw[i+1][j] == 0){
						yx[i+1][j] = yx[i+1][j] + yx[i][j-1] + yx[i][j] + yx[i][j+1];
					}
				}
			}
			for(int j = 0;j < w;j++){
				if(hw[i+1][j] == 2){
					int cnt = 0;
					while(true){
						if(i+cnt+1 == h-2){
							cnt = cnt + 1;
							break;
						}else{
							cnt = cnt + 2;
						}
						if(hw[i+cnt+1][j] != 2)break;
					}
					yx[i+cnt+1][j] = yx[i+cnt+1][j] + yx[i][j];
				}
			}
		}
		for(int i = 0;i < w;i++){
			result = result + yx[h-1][i];
		}
//		for(int i = 0;i < h;i++){
//			for(int j = 0;j < w;j++){
//				System.out.print(yx[i][j]+" ");
//			}
//			System.out.println();
//		}
		return result;
	}
	void doIt() { 
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			int hw[][] = new int [h][w];
			if(h+w == 0)break;
			for(int i = 0;i < h;i++){
				for(int j = 0;j < w;j++){
					hw[i][j] = sc.nextInt();
				}
			}
			System.out.println(DP(h,w,hw));
		}
     }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	new Main().doIt();
    }
}