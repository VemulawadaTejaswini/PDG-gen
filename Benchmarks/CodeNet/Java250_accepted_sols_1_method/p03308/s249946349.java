import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int max = 0;
        int min = 2147483647;
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int j = 0; j < N; j++){
            max = Math.max(max, a[j]);
        }
        for(int k = 0; k < N; k++){
            min = Math.min(min, a[k]);
        }
        System.out.println(max-min);
    }
}