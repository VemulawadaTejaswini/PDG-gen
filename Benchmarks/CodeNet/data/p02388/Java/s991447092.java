import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Input x :");
            String line = reader.readLine();
            int x = Integer.parseInt(line);
            if(x < 1 || 100 < x ){
                System.out.println("x is not appropriate");
                System.exit(0);
            }

            System.out.println(x*x*x);

        }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }
}
