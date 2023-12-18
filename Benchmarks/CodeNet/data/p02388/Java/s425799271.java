import java.io.*;

public class Main {
 public static void main(String args[]){
  int x;
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  String but = br.readLine();
  x = Integer.parseInt(but);
  if(x >= 0 && x <= 100){
   x = x * x * x;
  }
 }
}