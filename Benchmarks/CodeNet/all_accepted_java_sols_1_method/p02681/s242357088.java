import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            
            String s = br.readLine();
            String t = br.readLine();
            t = t.substring(0, s.length());
            
            PrintWriter pw = new PrintWriter(System.out);
            pw.println((s.equals(t)) ? "Yes" : "No");
            pw.flush();
            
        }
    }
}