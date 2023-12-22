import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int total = 0;
        for(int i = 0; i < n; i++){
            t[i] = sc.nextInt();
            total += t[i];
        }
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            int k = sc.nextInt()-1;
            System.out.println(total-t[k]+sc.nextInt());
        }
    }
}