import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(stdR.readLine());
        int B = Integer.parseInt(stdR.readLine());
        int C = Integer.parseInt(stdR.readLine());
        int X = Integer.parseInt(stdR.readLine());
        int count = 0;
        for(int i = 0 ; i <= A ; i++) {
            for(int j = 0 ; j <= B ; j++) {
                for(int k = 0 ; k <= C ; k++) {
                    if((500 * i + 100 * j + 50 * k) == X)count++;
                }
            }
        }
        System.out.println(count);
    }
}