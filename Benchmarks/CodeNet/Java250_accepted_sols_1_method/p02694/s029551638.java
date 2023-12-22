import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        long X=0;
        int i=0;
        long n = 100;
        double k = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        X = Long.parseLong(r.readLine());
        do{
            i++;
            k = Math.ceil((double)(n/100));
            n += (long)k;
        }while(n<X);
        System.out.println(i);
    }
}