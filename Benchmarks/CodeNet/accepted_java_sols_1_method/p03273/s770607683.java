import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int h = sc.nextInt();
      	int w = sc.nextInt();
    	int ma[][] = new int[h][w];
      	int mb[][] = new int[h][w];
      	String stack;
      	boolean elh[] = new boolean[h];
      	boolean elw[] = new boolean[w];
      	boolean elj = true;
      
      	for(int i = 0;i < h;i++) elh[i] = false;
      	for(int i = 0;i < w;i++) elw[i] = false;
      	
		
      	for(int i = 0;i < h;i++){
          stack = sc.next();
          elj = true;
          for(int j = 0;j < w;j++){
          	if(stack.charAt(j) == '#'){
              ma[i][j] = 1;
              elj = false;
            } else ma[i][j] = 0;
          }
          if(elj) elh[i] = true;
        }
     
      	for(int i = 0; i < w;i++){
          	elj = true;
        	for(int j = 0; j < h && elj;j++){
            	if(ma[j][i] == 1) elj = false;                      
            }
          	if(elj) elw[i] = true;
        }
      
      	for(int i = 0; i < h;i++){
          if(!elh[i]){
        	for(int j = 0; j < w;j++){
            	if(!elw[j]) {
                  if(ma[i][j] == 1) System.out.print('#');
                  else System.out.print('.');
                }                     
            }
         	System.out.println();
          }
        }      	
     
	}
}
