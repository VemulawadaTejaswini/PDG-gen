import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        long yono = 0;
        for(int i = 0 ; i < n ; i++){
            yono += a[i] / 2;
        if(i != n - 1 && a[i + 1] != 0){
                a[i + 1] += a[i] % 2;
            }
        }
        sc.close();
        System.out.println(yono);
    }
}