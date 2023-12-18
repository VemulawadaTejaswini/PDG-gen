//b棟f階のr番目の部屋にv人が追加で入居したことを示します。vが負の値の場合、v人退去したことを示します。 

import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        
        
        int[][] A = new int[n][m];
        
        int[] b = new int[m];
        
      //Aの配列にforとscanner使って代入
        for(int i = 0 ; i < n ; i++ ){
        	for(int j = 0 ; j < m ; j++ ){
        		A[i][j] = sc.nextInt();
        	}
        }
        
      //bの配列にforとscanner使って代入
        for(int k = 0 ; k < m ; k++ ){
        	b[k] = sc.nextInt();
        }
        
        //計算作業
        
        int x,y;
        int sum;
        
        for( x = 0 ; x < n ; x++ ){
        	sum = 0;
        	for(y = 0 ; y < m ; y++ ){
        		
        		
        		sum = sum + A[x][y] * b[y];
        		
        	}
        System.out.println(sum);
        }
    }
}