import java.io.*;

public class Main {
 public static void main(String[] args){
  int x;
  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
  String line = reader.readLine();
  x = Integer.parseInt(line);
  System.out.println(x*x*x);
 }
}