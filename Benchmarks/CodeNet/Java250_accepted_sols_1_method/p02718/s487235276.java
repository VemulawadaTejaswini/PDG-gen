import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int s = 0;
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
            s += a[i];
        }
        Arrays.sort(a);
        sc.close();
        if(1.0 * s / (4 * m) > a[n - m]){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}