import java.io.*;
public class Main{
  public static void main(String args[]) throws IOException{
    BufferedReader reader  = new BufferedReader (new InputStreamReader(System.in));
    String[] list = reader.readLine().split(" ");
    if(Integer.parseInt(list[0])+Integer.parseInt(list[1])+Integer.parseInt(list[2]) >=22){
      System.out.println("bust");
    }
    else{
      	System.out.println("win");
    }}}