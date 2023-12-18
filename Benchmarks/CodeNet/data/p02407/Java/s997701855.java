import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        long[] ary = new long[n];
        
        for (int i = 0; i < n; i++) {
            ary[n-1-i] = sc.nextLong();
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ary[i]).append(" ");
        }
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb.toString());
    }
}