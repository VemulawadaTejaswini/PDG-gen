import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int h = scan.nextInt();
        int n = scan.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        System.out.println(h <= sum ? "Yes" : "No");
        scan.close();
    }
}