import java.io.*;
public class Main {
    public static void main(String args[]) {
        
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        try {
            int x = 0;
            String str = input.readLine();
            x = Integer.parseInt(str.trim());
            System.out.println(x*x*x);
        } catch(IOException e) {
        }
    }
}