import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
  public static void main(String args[]) throws IOException{
   int n,m,l;
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String line = br.readLine(); 
   String[] token = line.split(" ");
   n = Integer.parseInt(token[0]);
   m = Integer.parseInt(token[1]);
   l = Integer.parseInt(token[2]); 
   int[][] matrixA = new int[n][m];
   int[] matrixB = new int[m][l];
   int[] matrixanswer = new int[n][l]; 
 
   for(int i = 0; i < n ;i++){
     String line2 = br.readLine(); 
     String[] token2 = line2.split(" ");
     for(int j = 0; j < m ;j++){
        matrixA[i][j] = Integer.parseInt(token2[j]);
         
     }//for  
   }//for
 
   for(int k = 0; k < m ;k++){
     String line2 = br.readLine(); 
     String[] token2 = line2.split(" ");
     for(int l = 0; l < l ;l++){
        matrixB[k][l] = Integer.parseInt(token2[l]);
         
     }//for  
   }//for
 
   for(int o = 0; o < m ;o++){
      for(int p = 0; p < l ;p++){
        matrixanswer[o][p] = 0;
         
     }//for 
   }   
 
  for(int q = 0; q < m ;q++){
      for(int r = 0; r < l ;r++){
        matrixanswer[q][r] += matrixA[q][r]*matrixB[q][r];
      }
   
  }
 
    for(int s = 0; s < m ;s++){
      for(int t = 0; t < l ;t++){
       if(t<l-1){ 
        System.out.print(matrixanswer[s][t]+" ");
       }else{
        System.out.print(matrixanswer[s][t]);
       }
      }
       System.out.print("\n"); 
    }
 
  }
}