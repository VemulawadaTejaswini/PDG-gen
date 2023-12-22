import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextLong();
        }

        double inverseSum = 0.0;
        for(int i=0; i<n; i++){
            inverseSum += ((double)1 / a[i]);
        }

        System.out.println((double)1 / inverseSum);
       }
}