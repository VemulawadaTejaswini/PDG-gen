import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        System.out.println((a * b) + " " + (2*a+2*b));
    }
}