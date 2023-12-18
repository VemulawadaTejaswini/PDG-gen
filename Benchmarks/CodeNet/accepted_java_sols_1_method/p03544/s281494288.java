import java.io.*;
public class Main{
  public static void main(String[] args){
    try{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	  int N = Integer.parseInt(bf.readLine());
      long a = 2;
      long b = 1;
      long c = N == 0 ? a : N == 1 ? b : 0;
      for(int i = 2; i <= N; i++){
      	c = a+b;
        a = b;
        b = c;        
      }
      System.out.println(c);
    } catch(IOException e){}
  }
}
    