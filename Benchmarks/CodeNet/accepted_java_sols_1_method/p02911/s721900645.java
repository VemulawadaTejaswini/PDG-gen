import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int[] a = new int[q];
        for(int i = 0; i < q; i++) a[i] = scan.nextInt();
        int[] p = new int[n];
        Arrays.fill(p, k - q);
        for(int i = 0; i < q; i++){
            p[a[i] - 1]++;
        }
        for(int i = 0; i < n; i++){
            System.out.println(p[i] <= 0 ? "No" : "Yes");
        }
        scan.close();
    }
}