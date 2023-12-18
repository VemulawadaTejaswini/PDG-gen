import java.io.*;
import java.util.*;

class Main{
    static int[][] A;
    static int[] B;
    static int i, j, k, n;
    
    public static void main(String[] args){
	try{
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 	    String s;
	    s = bf.readLine();
	    n = Integer.parseInt(s);
	    A = new int[n][n];
	    B = new int[n+1];
	    //初期化
	    for(i=0 ; i<n ; i++){
		for(j=0 ; j<n ; j++){
		    A[i][j] = 0;
		}
	    }
	    //データ入力
	    
	    for(i=0 ; i<n ; i++){
		StringTokenizer S = new StringTokenizer(bf.readLine());
		B[0] = Integer.parseInt(S.nextToken());
		B[1] = Integer.parseInt(S.nextToken());
		if(B[1] == 0)continue;
		for(j=0 ; j<B[1] ; j++){
		    B[j+2] = Integer.parseInt(S.nextToken());
		}
		for(k=0 ; k<B[1] ; k++){
		    A[i][B[k+2]-1]++;
		}
	    }
	}
	catch(IOException e){
	    System.out.println(e);
	}

	
	for(i=0 ; i<n ; i++){
	    for(j=0 ; j<n-1 ; j++){
		System.out.print(A[i][j]+" ");
	    }
	    System.out.println(A[i][j]);
	}
	
    }
}

