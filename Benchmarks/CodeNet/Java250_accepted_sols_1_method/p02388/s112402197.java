import java.io.*;
class Main{
  public static void main(String[] args)throws java.io.IOException{
             BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  
             String hoge = input.readLine();
             int x = Integer.parseInt(hoge);
             int ans=0;
 
             ans = x*x*x;
  
             System.out.println(ans);
       }
}
     