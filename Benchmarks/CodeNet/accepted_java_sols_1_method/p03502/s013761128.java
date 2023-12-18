

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int a = N;
        int sumdigit = 0;
        while(a != 0){
            sumdigit += a % 10;
            a /= 10;
        }
        if(N % sumdigit == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}