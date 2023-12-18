import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        
        int a, b, d, r;
        double f;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");
        
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);
        
        d = a + b;
        r = a % b;
        f = 1.0 * a / b;
        
        System.out.printf("%ld %ld %1.5f", d, r, f);
    }
}