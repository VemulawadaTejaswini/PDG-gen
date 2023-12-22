import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        int result = 0;
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.next());
        int a[] = new int[n];

        for (int i=0; i<n; i++) {
               a[i] = Integer.parseInt(in.next());
        }

        for (int i=1; i<=n; i++) {
            System.out.print(a[n-i]);

            if (i != n)
                System.out.print(" ");
        }

        System.out.println("");
    }
}