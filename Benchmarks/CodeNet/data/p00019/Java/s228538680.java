import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
    	System.out.println(fact(Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine())));}
    private static long fact(long n){return (n==0)?1:n*fact(n-1);}
}