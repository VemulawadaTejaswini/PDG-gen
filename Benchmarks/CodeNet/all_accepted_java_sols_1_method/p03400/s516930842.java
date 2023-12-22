import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n+1];
        a[0] = 0;
        int sum = x;
        for(int i=1;i<=n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            sum += 1+(d-1)/a[i];
        }
        System.out.println(sum);
    }
}