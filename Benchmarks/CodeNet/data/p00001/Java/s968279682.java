import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] a){
    int[] in = new int[10];
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
       for(int i=0; i<10; i+;){
         in[i] = Integer.parseInt(read.readLine());
       }
       Arrays.sort(in);
       System.out.println(in[9]+"/n"+in[8]+"/n"+in[7]+"/n");

       }
  

  }

}