import java.io.*;

public class Main{
    public static void main(String[] args){
        String line;
        int x;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            line = reader.readLine();
            x = Integer.parseInt(line);
            System.out.println(x*x*x);
        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
