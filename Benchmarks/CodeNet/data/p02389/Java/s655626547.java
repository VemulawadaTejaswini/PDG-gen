import java.io.*;
class Main{
   public static void main(String[] args)throws java.io.IOException{
    
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 
      String hoge1 = input.readLine();
      int a = Integer.parseInt(hoge1);
 
　　　System.out.print(" ");
 
      String hoge2 = input.readLine();
      int b = Integer.parseInt(hoge2);
 
　　　System.out.println();
 
      System.out.println(a*b+" "+2*a+2*b);
       }
}