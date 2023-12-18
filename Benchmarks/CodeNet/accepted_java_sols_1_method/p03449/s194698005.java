import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int x[][] = new int[2][n];
       for(int i = 0; i < 2; i++){
           for(int j = 0; j < n; j++){
               x[i][j] = sc.nextInt();
           }
       }
       int ans = 0;
       for(int i = 0; i < n; i++){
           int count = 0;
           for(int j = 0; j < n; j++){
               if(i == j){
                   count += x[0][j];
               }
               if(i <= j){
                   count += x[1][j];
               }else {
                   count += x[0][j];
               }
           }
           ans = Math.max(ans,count);
           //System.out.println(count);
       }
        System.out.println(ans);
    }
}
