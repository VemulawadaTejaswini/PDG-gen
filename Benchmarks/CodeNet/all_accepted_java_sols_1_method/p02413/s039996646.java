//7-C

import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();//行
        int c = sc.nextInt();//列
        
        int[][] num = new int[r+1][c+1];//配列宣言 //ok
        
        //配列の中に整数代入
        for( int i = 0 ; i < r ; i++ ){
        	for ( int j = 0 ; j < c ; j++ ){
        		
        		num[i][j] = sc.nextInt();
        		
        		num[r][j] = num[r][j] + num[i][j];
        		num[i][c] = num[i][c] + num[i][j];
        		
        	}
        }
        
        //総合計入力
    	for ( int j = 0 ; j < c ; j++ ){
    		
    		num[r][c] = num[r][c] + num[r][j];
    		
    	}
        	
        
        //配列の中身と合計を出力
       for( int i = 0 ; i < r+1 ; i++ ){
        	for ( int j = 0 ; j < c+1 ; j++ ){
        		
        		if(j == 0){
        			System.out.print(num[i][j]);
        		}else{
        			System.out.print(" " + num[i][j]);
        		}
        		
        	}
        	System.out.println();
        }
    }
}