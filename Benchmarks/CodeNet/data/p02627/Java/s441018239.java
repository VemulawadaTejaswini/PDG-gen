import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        char ch = br.readLine().trim().charAt(0);
        if(ch>='A' && ch<='Z') out.println('A');
        else out.println('a');
        out.flush();
    }
}