
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int A = sc.nextInt();
        double[] hei = new double[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            hei[i] = Math.abs(A-(T-sc.nextInt()*0.006));
        }
        double min = Double.MAX_VALUE;
        int c = -1;
        for (int i = 0; i < N; i++) {
            if(min>hei[i]){
                min=hei[i];
                c=i;
            }
        }
        System.out.println(c+1);
        
    }
}