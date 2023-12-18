import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        System.out.println(fun(n));
    }
    
    static int fun(int n){
         return (n==0) ? 1:n*fun(n-1);
    }
}