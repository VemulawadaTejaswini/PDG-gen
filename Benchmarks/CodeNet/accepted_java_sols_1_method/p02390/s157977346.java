import java.io.*;

public class Main{
    public static void main(String []args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int t = Integer.parseInt(line);
            int h = t / 3600;
            int m = t % 3600 / 60;
            int s = t % 3600 % 60;
            System.out.println(h+":"+m+":"+s);

            
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
