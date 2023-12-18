
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);


        String s = in.readLine();
        if (s.charAt(s.length() - 1) == 's') pw.println(s + "es");
        else pw.println(s + "s");
        
        pw.close();
    }
   
}
