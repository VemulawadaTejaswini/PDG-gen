import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int h= sc.nextInt();
        int w = sc.nextInt();
        int m = sc.nextInt();
        int[][] bom = new int[h][m];
        
        for(int i = 0; i < m; i++){
          int tmph = sc.nextInt();
          int tmpw = sc.nextInt();
          bom[tmph-1][tmpw-1] = 8;
        }
      
      /*for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          System.out.print(bom[i][j]);
        }
        System.out.println();
      }*/
      
      int count = 0;
      int ans = 0;
      for(int i = 0; i < h; i++){
        for(int j = 0; j < w; j++){
          //if(bom[i][j] == 0){
            for(int k = 0; k < w; k++){
              if(bom[i][k] == 8){
                count++;
              }
            }
            
            for(int l = 0; l < h; l++){
              if(bom[l][j] == 8){
                count++;
              }
            }
            
            if(ans < count){
              ans = count;
              if(bom[i][j] == 8){
                ans--;
              }
            }
          //}
          
          count = 0;
        }
      }
        
        System.out.println(ans);
      
      
	}
}