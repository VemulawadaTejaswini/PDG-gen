import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
		int n= scan.nextInt();
		int m = scan.nextInt();
        
        out.println(n == m ? "Yes" : "No");
        out.close();
        
    }
}