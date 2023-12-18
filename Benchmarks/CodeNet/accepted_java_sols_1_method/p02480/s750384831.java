import java.io.*;
 
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new java.io.InputStreamReader(System.in));
        int x = Integer.parseInt(read.readLine());
    	int n=x*x*x;
        System.out.println(n);
    }
}