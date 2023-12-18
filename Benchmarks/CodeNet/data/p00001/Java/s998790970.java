import java.io.*;
import java.util.*;

public class Main{
   public static void main(String[]args){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int[] k = new int[10];

      for(int i=0; i < 10; i++){
      k[i] = Integer.parseInt(br.readLine());
      }

     Arrays.sort(k); 


      for(int i=0; i<3; i++){
      System.out.println(k[9-i]);
      }
}