import java.io.*;
import java.math.*;
class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    int length = Integer.parseInt(line);
    int cubic = (int)Math.pow(length,3);
    System.out.println(cubic);
  }
}

