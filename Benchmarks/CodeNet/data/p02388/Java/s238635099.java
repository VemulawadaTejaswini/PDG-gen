import java.io.*;
 
class Main {
    public static void main (String[ ] args){      
        BufferedReader input =
            new BufferedReader (new InputStreamReader (System.in));
        String s = input.readLine( );
        int x = Integer.parseInt(s);
        System.out.println(x*x*x);
    }
}