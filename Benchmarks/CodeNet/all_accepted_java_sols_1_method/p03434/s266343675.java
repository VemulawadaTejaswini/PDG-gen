//package Contest088;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int n  = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int alice=0,bob =0;
            for(int i=arr.length-1;i>=0;i--)
            {
                if(i%2==0)
                    alice+=arr[i];
                else
                    bob+=arr[i];
            }
            if(alice>bob)
                out.println(alice-bob);
            else
                out.println(bob-alice);
        out.flush();
    }
}
