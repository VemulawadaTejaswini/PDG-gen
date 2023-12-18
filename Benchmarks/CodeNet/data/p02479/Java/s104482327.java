import java.io.*;

public class Main{
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      double r = Integer.parseInt(reader.readLine());
      double pi = Math.PI;
      double area = pi * r * r;
      double length = 2 * pi * r;
      System.out.printf("%f %f\n", area, length);
    }catch(IOException e){
      System.out.println(e);
    }catch(NumberFormatException e){
      System.out.println("Input correct radius.");
    }
  }
}