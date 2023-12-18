import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            double r = Double.parseDouble(line);
            double S = r * r * Math.PI;
            double L = 2 * r * Math.PI;
            System.out.println(S+" "+L);
        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
