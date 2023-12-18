import java.io.*;

class Main{
  public static void main(String[] args)throws java.io.IOException{
	
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	String hoge = input.readLine();
	int i = Integer.parseInt(hoge);

	System.out.println(i*i*i);
  }
}