import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		int k = scan.nextInt();
		int x = scan.nextInt();
        
        out.println(500 * k >= x ? "Yes" : "No");
        out.close();
        
    }
}