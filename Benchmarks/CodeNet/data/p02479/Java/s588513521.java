import java.io.*;

public class Main{
   public static void main(String[] args){
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try{
      String line;
      double r,s,l;
      line = reader.readLine();
      r = Double.parseDouble(line);
      double pi = Math.PI;
      s = r*r*pi;
      l = 2*r*pi;
      System.out.println(s+" "+l);
    } catch(IOException e){
      System.out.println(e);
    } catch(NumberFormatException e){
      System.out.println("Foult");
    }
   }
}