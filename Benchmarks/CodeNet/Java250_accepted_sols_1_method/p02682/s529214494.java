
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);
        int K = Integer.parseInt(str[3]);

        if(A >= K){
            System.out.println(K);
        }
        else if(A+B >= K){
            System.out.println(A);
        }
        else if(A+B+C >= K){
            System.out.println(A-(K - (A+B)));
        }
    }
}
