import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
  public static void main(String args[]) throws IOException{
   
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String[] token = br.readLine().split(" ");
   int r = Integer.parseInt(token[0]);      
   int c = Integer.parseInt(token[1]);   
   int[] Columnsum = new int[c];
   int totalsum = 0;  
   for(int k = 0;k < c; k++){      
        Columnsum[k] = 0;
   }
   
  
   for(int i = 0;i < r; i++){
      String[] token2 = br.readLine().split(" ");
      int sum = 0;
      for(int j = 0;j < c; j++){      
        System.out.print(token2[j] + " ");
        Columnsum[j] += Integer.parseInt(token2[j]);
        sum += Integer.parseInt(token2[j]);
      }
      totalsum += sum;
      System.out.println(sum);
   }

   for(int l = 0;l < c; l++){      
        System.out.print(Columnsum[l] + " ");
   }
   System.out.println(totalsum);

    
  }
}