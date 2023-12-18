import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            double a = Double.parseDouble(line);
            line = reader.readLine();
            double b = Double.parseDouble(line);
            
            System.out.println(a*b + (a+b)*2 );

        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
