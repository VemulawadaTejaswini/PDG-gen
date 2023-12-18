import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i=1; i<n; i++){
            a[stdIn.nextInt() - 1]++;
        }

        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}