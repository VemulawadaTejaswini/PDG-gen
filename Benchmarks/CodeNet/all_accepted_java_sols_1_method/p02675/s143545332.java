import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String N = br.readLine();
        String target = N.substring(N.length() - 1);
        
        if("2".equals(target) || "4".equals(target) || "5".equals(target) || "7".equals(target) || "9".equals(target)) {
            pw.println("hon");
        } else if("0".equals(target) || "1".equals(target) || "6".equals(target) || "8".equals(target)) {
            pw.println("pon");
        } else {
            pw.println("bon");
        }

        br.close();
        pw.close();
    }
}