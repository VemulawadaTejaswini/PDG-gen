import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
        int w = sc.nextInt();
        String s[] = new String[h];
        for(int i = 0; i < h; i++){
        	s[i] = sc.next();
        }
        int ans[][] = new int[h][w]; 
        for(int i = 0; i < h; i++){
        	for(int j = 0; j < w; j++){
            	if(s[i].substring(j, j + 1).equals(".")){
                	ans[i][j] = 0;
                }else{
                    ans[i][j] = -1;
                }
            }
        }
        for(int i = 0; i < h; i++){
        	for(int j = 0; j < w; j++){
            	if(ans[i][j] != -1){
                    //左上の値
                	if(i != 0 && j != 0 && ans[i - 1][j - 1] == -1){
                    	ans[i][j]++;
                    }
                    //上の値
                    if(i != 0 && ans[i - 1][j] == -1){
                    	ans[i][j]++;
                    
                    }
                    //右上の値
                    if(i != 0 && j != w - 1 && ans[i - 1][j + 1] == -1){
                    	ans[i][j]++;
                    }
                    //左の値
                    if(j != 0 && ans[i][j - 1] == -1){
                    	ans[i][j]++;
                    }
                    //右の値
                    if(j != w - 1 && ans[i][j + 1] == -1){
                    	ans[i][j]++;
                    }
                    //左下の値
                    if(i != h - 1 && j != 0 && ans[i + 1][j - 1] == -1){
                    	ans[i][j]++;
                    }
                    //下の値
                    if(i != h - 1 && ans[i + 1][j] == -1){
                    	ans[i][j]++;
                    }
                    //右下の値
                    if(i != h - 1 && j != w - 1 && ans[i + 1][j + 1] == -1){
                    	ans[i][j]++;
                    }
                }
            }
        }
        for(int i = 0; i < h; i++){
        	for(int j = 0; j < w; j++){
            	if(ans[i][j] == -1){
                	System.out.print("#");
                }else{
                	System.out.print(ans[i][j]);
                }
            }
            System.out.println();
        }
    }
} 