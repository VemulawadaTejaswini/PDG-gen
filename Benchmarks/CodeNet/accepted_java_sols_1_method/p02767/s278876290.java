import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i = 0 ; i < n ; i++){
            x[i] = sc.nextInt();
        }
        long s = 1000000;
        for(int i = 1 ; i <= 100 ; i++){
            long k = 0;
            for(int g = 0 ; g < n ; g++) {
                k = k + (x[g]) * (x[g]) + i * i - 2 * i * x[g];
            }
            if(s > k){
                s = k;
            }
        }
        System.out.println(s);
        sc.close();
    }
}