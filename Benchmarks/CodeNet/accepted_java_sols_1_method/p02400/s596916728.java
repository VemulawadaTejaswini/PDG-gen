import java.io.*;
public class Main{
    public static void main(String[] args){
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         double S;
         double l;
     try{
         String line = reader.readLine();
         double r = Double.parseDouble(line);
         S = Math.PI * r * r;
         l = 2 * Math.PI * r;
         System.out.printf("%f %f",S,l);
     }catch(IOException e){
         System.out.println(e);
     }catch(NumberFormatException e){
         System.out.println("数値が正しくありません");
     }
    }
}
