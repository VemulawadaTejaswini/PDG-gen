import java.util.*;
import java.util.Arrays;
import java.lang.Math; 
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 1;

        for(int i = 1 ; i <= N; i++){
            int b = 1000000007;
            sum = (sum * i) % b;
        }
        
        System.out.println(sum);
    }
}