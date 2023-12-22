import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int[] v = new int[n];
        for(int i=0; i<n; i++){
            v[i] = stdIn.nextInt();
        }

        Arrays.sort(v);
        double sum = (double)(v[0] + v[1]) / 2;
        for(int i=2; i<n; i++){
            sum = (double)(sum + v[i]) / 2;
        }

        System.out.println(sum);
    }
}