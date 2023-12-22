import java.io.*;
 
public class Main { 
    public static void main(String[] args) throws IOException {             
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();
        int x = Integer.parseInt(s);
        double i = Math.pow(x, 3);
        int ans = (int)i;
        System.out.println(ans);
    } 
}