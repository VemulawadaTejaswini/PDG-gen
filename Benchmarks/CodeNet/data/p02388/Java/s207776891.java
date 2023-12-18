import java.io.*;

class Main{
   public static void main(String[] args){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String num_s = br.readLine();
      int num = Integer.parseInt(num_s);
      System.out.println(num*num*num);
   }
}