import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
    	Scanner sn = new Scanner(System.in);
      	int n = sn.nextInt();
      	int[][] d = new int[n+1][4];
      	for(int i=1;i<=n;i++){
          for(int j=1;j<=3;j++){
         	d[i][j] = sn.nextInt();   
          }
        }
      	
      	int[][] ans = new int[n+1][4];
      	ans[n][1] = d[n][1];
      	ans[n][2] = d[n][2];
        ans[n][3] = d[n][3];
      
      	for(int i=n-1;i>=1;i--){
          for(int j=1;j<=3;j++){
          	if(j==1){
              ans[i][1] = d[i][1] + Math.max(ans[i+1][2],ans[i+1][3]);
            }else if(j==2){
              ans[i][2] = d[i][2] + Math.max(ans[i+1][1],ans[i+1][3]);
            }else if(j==3){
              ans[i][3] = d[i][3] + Math.max(ans[i+1][1],ans[i+1][2]);
            }
          }
        }
        int pv =  Math.max(ans[1][1] ,Math.max(ans[1][2],ans[1][3]));
      	System.out.println(pv);
    }
}