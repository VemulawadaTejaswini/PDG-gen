import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] c = new char[h][w];
      for(int i = 0;i < h;i++)c[i]=sc.next().toCharArray();
      for(int i = 0;i < h;i++){
      	for(int j = 0;j < w;j++){
        	if(c[i][j]=='#'){
            	if((i>=1&&c[i-1][j]=='#')||(i<=h-2&&c[i+1][j]=='#')||(j>=1&&c[i][j-1]=='#')||(j<=w-2&&c[i][j+1]=='#')){}
                else {
                	System.out.println("No");
                    return;
                }
            }
        }
      }
      System.out.println("Yes");
    }
}