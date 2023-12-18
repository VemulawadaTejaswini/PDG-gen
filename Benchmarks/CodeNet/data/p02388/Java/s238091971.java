import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String x   = input.readLine();
    int output = Integer.parseInt(x);
    output = output^3;
    System.out.println(output);
    }
}
