import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n+1];
        for (int i = 0; i < n-1; i++) {
            int f = scan.nextInt();
            ar[f]+=1;
        }

        for (int i = 1; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
