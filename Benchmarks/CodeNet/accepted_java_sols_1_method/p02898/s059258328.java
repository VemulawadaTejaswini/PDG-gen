import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] h = new int[n];
        int a = 0;
        for(int i = 0; i < n; i++){
            h[i] = scan.nextInt();
            if(h[i] >= k){
                a++;
            }
        }
        System.out.println(a);
    }
}