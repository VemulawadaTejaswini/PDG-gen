import java.io.*;

class Main{
  public static void main(String[] args){
	  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	  String hoge = input.readLine();
	  int x = Integer.parseInt(hoge);
      System.out.println(x*x*x);
  }
}