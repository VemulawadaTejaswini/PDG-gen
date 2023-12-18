import java.util.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int min = 0;
        int max = 0;
        int sum = 0;
        int ans = 0;

        for(int i = 0 ; i < N ; i++){
            a[i] = sc.nextInt();

            if(i == 0){
                min = a[0];
                max = a[0];
            }

            if(min > a[i]){
                min = a[i];
            }

            if(max < a[i]){
                max = a[i];
            }
        }

        for(int j = min ; j <= max ; j ++){
            sum = 0;
            
            for (int i = 0 ; i < N ; i++){
                sum = sum + (a[i] - j) * (a[i] - j) ;
            }

            if(j == min){
                ans = sum;
            }

            if(ans > sum){
                ans = sum;
            }
        }

        System.out.println(ans);
    }
}