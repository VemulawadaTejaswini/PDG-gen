import java.util.*;
 
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
        int M = sc.nextInt();
        String s[] = new String[H];
        for(int i = 0; i < H; i++){
        	s[i] = sc.next();
        }
      
        int[][] hm = new int[H][M];
        for(int i = 0; i < H; i++){
          for(int j = 0; j < M ; j++){
            if(s[i].charAt(j) == '.'){
              hm[i][j] = 0;
            }else{
              hm[i][j] = -1;
            }
           
          }
        }
      
        for(int i = 0; i < H; i++){
        	for(int j = 0; j < M; j++){
            	if(hm[i][j] != -1){
                	if(i != 0 && j != 0 && hm[i-1][j-1] == -1){
                    	hm[i][j]++;
                    }
                    if(i != 0 && hm[i-1][j] == -1){
                    	hm[i][j]++;
                    
                    }
                    if(i != 0 && j != M-1 && hm[i-1][j+1] == -1){
                    	hm[i][j]++;
                    }
                  
                    if(j != 0 && hm[i][j-1] == -1){
                    	hm[i][j]++;
                    }
                    
                    if(j != M-1 && hm[i][j+1] == -1){
                    	hm[i][j]++;
                    }
                    
                    if(i != H-1 && j != 0 && hm[i+1][j-1] == -1){
                    	hm[i][j]++;
                    }
                    
                    if(i != H-1 && hm[i+1][j] == -1){
                    	hm[i][j]++;
                    }
                    
                    if(i != H-1 && j !=M-1 && hm[i+1][j+1] == -1){
                    	hm[i][j]++;
                    }
                }
            }
        }
        for(int i = 0; i < H; i++){
        	for(int j = 0; j < M; j++){
            	if(hm[i][j] == -1){
                	System.out.print("#");
                }else{
                	System.out.print(hm[i][j]);
                }
            }
            System.out.println();
        }
    }
} 