import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(b.readLine());
    System.out.println(a+a*a+a*a*a);
  }
}
