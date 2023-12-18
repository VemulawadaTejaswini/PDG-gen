import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0) break;
			
			char[][] map = new char[h][w];
			int[][] left = new int[h][w];
			int[][] right = new int[h][w];
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					map[i][j] = sc.next().charAt(0);
					left[i][j] = Integer.MAX_VALUE;
					right[i][j] = Integer.MAX_VALUE;
				}
			}
			
			for(int i=0;i<w;i++){
				if(map[h-1][i]=='S'){
					left[h-1][i] = 0;
					right[h-1][i] = 0;
				}
			}
			
			int ans = Integer.MAX_VALUE;
			while(true){
				boolean flag = false;
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if(left[i][j]!=Integer.MAX_VALUE){
							for(int p=-2;p<=2;p++){
								for(int q=1;q<=3-Math.abs(p);q++){
									if(0<=j+q && j+q<w && 0<=i+p && i+p<h){
										if(map[i+p][j+q]=='T' && ans>left[i][j]){
											ans = left[i][j];
											flag = true;
										}else if(map[i+p][j+q]=='S' || map[i+p][j+q]=='X'){
											continue;
										}else{
											if(left[i][j]+(int)map[i+p][j+q]-48 < right[i+p][j+q]){
												right[i+p][j+q] = left[i][j] + (int)map[i+p][j+q]-48;
												flag = true;
											}
										}
									}
								}
							}
						}
					}
				}
				
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if(right[i][j]!=Integer.MAX_VALUE){
							for(int p=-2;p<=2;p++){
								for(int q=1;q<=3-Math.abs(p);q++){
									if(0<=j-q && j-q<w && 0<=i+p && i+p<h){
										if(map[i+p][j-q]=='T' && ans>right[i][j]){
											ans = right[i][j];
											flag = true;
										}else if(map[i+p][j-q]=='S' || map[i+p][j-q]=='X'){
											continue;
										}else{
											if(right[i][j]+(int)map[i+p][j-q]-48 < left[i+p][j-q]){
												left[i+p][j-q] = right[i][j] + (int)map[i+p][j-q]-48;
												flag = true;
											}
										}
									}
								}
							}
						}
					}
				}
				
				if(flag==false) break;
			}
			if(ans==Integer.MAX_VALUE) System.out.println(-1);
			else System.out.println(ans);
		}
	}	
}