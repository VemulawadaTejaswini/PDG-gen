import java.io.*;
public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] list = reader.readLine().split(" ");
    System.out.println(list[1]+list[0]);}}