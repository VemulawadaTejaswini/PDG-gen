import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.lang.Math;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int ans = 0;
        for(int i = 0; i < n; i++){
            double key = sc.nextDouble();
            double value = sc.nextDouble();
            double r = Math.pow(key, 2) + Math.pow(value, 2);
            double a = Math.sqrt(r);
            if(a <= d){
                ans++;
            }
        }
        System.out.println(ans);
    }
}