import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
		long [][] item = new long [r+1][c+1];
        long [][][] ans = new long [r+1][c+1][4];
        for(int i=0;i<k;i++){int R = sc.nextInt();
                             int C = sc.nextInt();
                             long K = sc.nextLong();
                             item[R][C]=K;
                            }		
        for(int i=1;i<=r;i++){
          int count = 0;                              
          for(int j=1;j<=c;j++){                               
            if(item[i][j]==0 || count == 3){                                
              ans[i][j][count]=ans[i][j-1][count];
              ans[i][j][0]=Math.max(ans[i-1][j][0],Math.max(ans[i-1][j][1],Math.max(ans[i-1][j][2],ans[i-1][j][3])));
              if(item[i][j]>0){count=1;ans[i][j][1]=ans[i][j][0]+item[i][j];}
            }                              
            else{count++;
                 ans[i][j][count]=ans[i][j-1][count-1]+item[i][j];}
                 if(Math.max(ans[i-1][j][0],Math.max(ans[i-1][j][1],Math.max(ans[i-1][j][2],ans[i-1][j][3])))+item[i][j]>=ans[i][j][count])
                 {count=1;
                  ans[i][j][1]=Math.max(ans[i-1][j][0],Math.max(ans[i-1][j][1],Math.max(ans[i-1][j][2],ans[i-1][j][3])))+item[i][j];}
          }                           
        }       
		System.out.println(Math.max(ans[c][k][0],Math.max(ans[c][k][1],Math.max(ans[c][k][2],ans[c][k][3]))));
	}
}
