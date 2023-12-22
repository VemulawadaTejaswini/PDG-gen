import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if (sum > x) {
                break;
            }else{
                count++;
            }
        }
        if (count == n && sum != x) {
            System.out.println(count - 1);
        }else{
            System.out.println(count);
        }
    }
}