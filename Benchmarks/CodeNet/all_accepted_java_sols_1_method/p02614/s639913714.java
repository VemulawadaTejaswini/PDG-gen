import java.util.*;
import java.lang.Math;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	
      	int h = sc.nextInt();
      	int w = sc.nextInt();
      	int k1 = sc.nextInt();
      	int black = 0;
      	int count = 0;
      	int hp = (int)Math.pow(2,h);
      	int wp = (int)Math.pow(2,w);
      	boolean hd[] = new boolean[h];
      	boolean wd[] = new boolean[w];
      	boolean hws[][] = new boolean[h][w];
      	boolean shws[][] = new boolean[h][w];
      	String str;
      	char ch;
      	int istack;
      	int del = 0;
      	int dstack;
      
      	Arrays.fill(hd,false);
      	Arrays.fill(wd,false);
      
      	for(int i = 0;i < h;i++) {
          str = sc.next();
          for(int j = 0;j < w;j++) {
            ch = str.charAt(j);
            if(ch == '#') {
              black++;
              hws[i][j] = true;
            } else hws[i][j] = false;
          }
        }
      
      	black -= k1;
      
      	for(int i = 0;i < h;i++){
          for(int j = 0;j < w;j++) shws[i][j] = hws[i][j];
        } 
            
      	
      	for(int i = 0;i < hp;i++){
          del = 0;
          istack = i;
          for(int j = 0; j < h && istack > 0;j++){
          	if(istack%2 == 1) hd[j] = true;
          	else hd[j] = false;
          	istack /= 2;
          }
          for(int j = 0; j < h;j++){
            if(hd[j]){
              for(int k = 0; k < w;k++) {
                if(shws[j][k]){
                  del++;
                  shws[j][k] = false;
                }
              }
            }
          }
          dstack = del;
          for(int j = 0;j < wp;j++){
            istack = j;
            for(int k = 0;k < w;k++){
             if(istack%2 == 1) wd[k] = true;
          	 else wd[k] = false;
          	 istack /= 2;
            }
            for(int k = 0;k < w;k++){
              if(wd[k]){
              	for(int l = 0;l < h;l++){
                  if(shws[l][k]) del++;
                }
              }
            }
            if(del == black) count++;
           
            del = dstack;
          }
          
          for(int j = 0;j < h;j++){
          	for(int k = 0;k < w;k++) shws[j][k] = hws[j][k];
          } 
            
        }
  
           
      	System.out.println(count);
        
	}
}