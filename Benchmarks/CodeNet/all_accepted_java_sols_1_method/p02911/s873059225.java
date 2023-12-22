import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] nl = new int[n];
        Arrays.fill(nl,k-q);
        for(int i = 0; i < q; i++){
            int a = sc.nextInt()-1;
            nl[a]++;
        }
        for(int i = 0; i < n; i++){
            if(nl[i] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}