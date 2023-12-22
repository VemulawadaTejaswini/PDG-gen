import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[11];
        a[in.nextInt()]++;
        a[in.nextInt()]++;
        a[in.nextInt()]++;
        if(a[7] == 1 && a[5] == 2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}