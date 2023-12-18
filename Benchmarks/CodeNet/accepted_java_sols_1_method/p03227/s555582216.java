import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line.length()==2) System.out.println(line);
        else {
            System.out.print(line.charAt(2));
            System.out.print(line.charAt(1));
            System.out.print(line.charAt(0)+"\n");
        }
        //System.out.println("XXXXXXXX");
    }
}
