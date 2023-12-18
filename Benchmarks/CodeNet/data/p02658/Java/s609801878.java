import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextLong();
        }

        long mul = 1;
        long maxMul = 1000000000000000000L;
        for(int j = 0; j<n; j++){
            mul *= a[j];

        }
        if(mul < -maxMul || mul > maxMul){
            mul = -1;         
        }
        System.out.println(mul);
    }
}