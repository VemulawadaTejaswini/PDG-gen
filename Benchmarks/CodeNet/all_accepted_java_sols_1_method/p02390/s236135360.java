import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        String s = br.readLine();
        int x = Integer.parseInt(s);
        int secound = x % 60;
        x = x / 60;
        int minutes = x % 60;
        x = x / 60;
        int hour = x;
         
         
        System.out.println(hour + ":" + minutes + ":" + secound);
    }
 
}
 