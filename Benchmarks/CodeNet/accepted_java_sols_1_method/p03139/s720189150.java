import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String str = String.valueOf(in.readLine());
            String[] arr = str.split(" ", 0);
            int N = Integer.parseInt(arr[0]);
            int A = Integer.parseInt(arr[1]);
            int B = Integer.parseInt(arr[2]);
            int max = 0;
            int min = 0;
            int large = 0;
            int small = 0;
            int diff = 0;
            
            if (N < A || N < B) {
                System.out.println("Error");
                System.exit(0);
            }
            
            if (A > B) {
                max = B;
                large = A;
                small = B;
            } else {
                max = A;
                large = B;
                small = A;
            }
            
            diff = N - large;
            if (diff < small) {
                min = small - diff;
            } else {
                min = 0;
            }
            System.out.println(max + " " + min);
        } catch(Exception e) {
            System.out.println(e);
            System.exit(0);
        } 
    }
}