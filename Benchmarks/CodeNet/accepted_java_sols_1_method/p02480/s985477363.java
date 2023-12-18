import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(
                new java.io.InputStreamReader(System.in));
        int x = Integer.parseInt(read.readLine());
        System.out.println(x*x*x);
    }
}