import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
  public static void main(String args[]) throws IOException{
   int n,m;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String line = br.readLine(); 
   String[] token = line.split(" ");
   n = Integer.parseInt(token[0]);
   m = Integer.parseInt(token[1]);
   int[][] matrixA = new int[n][m];
   int[] matrixB = new int[m];

   for(int i = 0; i < n ;i++){
     String line2 = br.readLine(); 
     String[] token2 = line2.split(" ");
     for(int j = 0; j < m ;j++){
        matrixA[i][j] = Integer.parseInt(token2[j]);
        
     }//for  
   }//for
   
  }
}