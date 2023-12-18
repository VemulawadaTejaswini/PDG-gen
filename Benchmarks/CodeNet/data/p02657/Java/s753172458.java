import java.io.*;
 
public class Test1{
  public static void main(String[] args)throws IoException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
    int x = Integer.parseInt(br.readLine);
    int y = Integer.parseInt(br.readLine);
    System.out.println(x*y);
  }
}