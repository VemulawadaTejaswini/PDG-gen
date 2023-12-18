import java.io.*;

public class Main{
    public static void main (String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int x = Integer.parseInt(reader.readLine());
            System.out.println(x * x * x);
        } catch(IOException e){
            System.out.println(e);
        }
    }
}
