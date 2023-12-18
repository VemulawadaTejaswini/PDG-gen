import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String A   = input.readLine();
    String B   = input.readLine();
    String C   = input.readLine();

    int aa = Integer.parseInt(A);
    int bb = Integer.parseInt(B);
    int cc = Integer.parseInt(C);
    
    int[] output = new int[]{aa, bb, cc};
    Arrays.sort(output);
    System.out.println(output);
    
    }
}
