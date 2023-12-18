import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String txt = input.readLine();
    String A = txt.substring(0, 1);
    String B = txt.substring(2, 3);
    String C = txt.substring(4, 5);
    int intA = Integer.parseInt(A);
    int intB = Integer.parseInt(B);
    int intC = Integer.parseInt(C);
    int X[] = new int[]{intA, intB, intC};
    Arrays.sort(X);
    System.out.println(X[0] + " " + X[1] + " " + X[2]);
    }
}

