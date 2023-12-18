import java.io.*;

class Main{
public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt( reader.readLine() );
        System.out.println(Math.pow(input, 3));
    }
 
}