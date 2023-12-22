//b棟f階のr番目の部屋にv人が追加で入居したことを示します。vが負の値の場合、v人退去したことを示します。 

import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int [][][] bill = new int[4][3][10];
        
        int b ;
        int f ;
        int r ;
        int v = 0;
        
        for( int i = 0 ; i < n ; i++ ){
	        
	        b = sc.nextInt();//棟
	        f = sc.nextInt();//階
	        r = sc.nextInt();//番目
	        v = sc.nextInt();//人数
	        
	        bill[b-1][f-1][r-1] = bill[b-1][f-1][r-1] + ( v );
	        
	        /*for(int j = 0 ; j < 4 ; j++ ){
	        	for( int k = 0 ; k < 3 ; k++ ){
	        		for( int l = 0 ; l < 10 ; l++ ){
	        			
	        			if( bill[j][k][l] != v){
	        				bill[j][k][l] = 0;
	        			}
	        		}
	        	}
	        }*/  
        }
	        
        for(int j = 0 ; j < 4 ; j++ ){
        	for( int k = 0 ; k < 3 ; k++ ){
        		for( int l = 0 ; l < 10 ; l++ ){
        			
        			
        			System.out.print(" " + bill[j][k][l]);
        			
        		}
        		System.out.println();
        	}
        	if( j != 3){
        	System.out.println("####################");
        	}
        }     
    }
}