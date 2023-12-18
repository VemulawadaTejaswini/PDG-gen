import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.next()),A[]=new int[n];
        for(int i=0; i<n; i++) {
            A[i] =Integer.parseInt(in.next());
        }
        int q=Integer.parseInt(in.next());
        for(int i=0;i<q;i++) {
            int key = Integer.parseInt(in.next());
            if (Arrays.binarySearch(A, key) >= 0 ) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
