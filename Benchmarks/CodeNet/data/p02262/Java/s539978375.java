
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 int cnt;
	 int m = 2;
	 int [] G = new int[m];
	 G[0] = 4;
     G[1] = 1;


    int n = Integer.parseInt( br.readLine() );
    int [] A = new int[n];
    for(int i = 0; i < n ; i++){
          A[i] = Integer.parseInt( br.readLine() );
    }

    cnt = 0;
    for(int i = 0; i < m ; i++){

       for( int j = G[i]; j < n ; j++ ){
    	   int v = A[j];
    	   int x = j - G[i];

    	   while( x >= 0 && A[x] > v ){
    		   A[x+G[i]] = A[x];
               x = x-G[i];
               cnt++;
    	   }
    	   A[x+G[i]] = v;

       }

    }

     System.out.println(m);
    for(int i = 0; i < m ; i++){
    	System.out.print(G[i]);
        if(i < m-1){
            System.out.print(" ");
        }
    }
    System.out.println();
    System.out.println(cnt);

    for(int i = 0; i < n ; i++){
    	System.out.println(A[i]);

    }

 }
}