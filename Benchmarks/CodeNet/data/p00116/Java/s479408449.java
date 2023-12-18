import java.util.Scanner;

public class Main{

   public static void main(String[] args) {
       new Main().main();
   }
   void main() {
       Scanner sc = new Scanner(System.in);
       while(true) {
           int h = sc.nextInt();
           int w = sc.nextInt();
           if(h==0 && w==0) break;
           char[][] rec = new char[h+1][w+1];
           for(int i=1;i<=h;i++) {
               String s = sc.next();
               for(int j=1;j<=w;j++) {
                   rec[i][j] = s.charAt(j-1);
               }
           }
           int[][] row = new int[h+1][w+1];    // そのセルまで、左側から横向きに何連続しているか
           for(int i=1;i<=h;i++) {
               for(int j=1;j<=w;j++) {
                   if(rec[i][j] == '.') {
                       row[i][j] = row[i][j-1] + 1;
                   }else {
                       row[i][j] = 0;
                   }
               }
           }
           
           int[][] dp = new int[h+1][w+1];  // (i,j)番地を右下とする長方形の最大面積を記録
           for(int i=1;i<=h;i++){
               for(int j=1;j<=w;j++) {
            	   int rmin = row[i][j];
            	   for(int k=i;k>=1;k--) {
            		   rmin = Math.min(row[k][j], rmin);
            		   dp[i][j] = Math.max(rmin*(i-k+1), dp[i][j]);
            	   }
               }
           } 
               
           int max = 0;
           for(int i=1;i<=h;i++) {
               for(int j=1;j<=w;j++) {
                   max = Math.max(dp[i][j], max);
               }
           }
           System.out.println(max);
       }

   }
}
