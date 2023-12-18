import java.io.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
    
    BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
    String inp_x   = input.readLine();
    String inp_y   = input.readLine();
    int x = Integer.parseInt(inp_x);
    int y = Integer.parseInt(inp_y);
    String output = Math.max(x, y);
    output = output + Math.min(x, y);
    System.out.println(output);
    }
}
