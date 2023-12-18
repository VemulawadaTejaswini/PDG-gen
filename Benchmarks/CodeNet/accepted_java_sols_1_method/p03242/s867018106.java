import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split("");
        for (String word: line) {
            if (word.equals("9")) {
                out.print("1");
            } else if (word.equals("1")) {
                out.print("9");
            }
        }
        out.println("");
        out.close();
    }
}