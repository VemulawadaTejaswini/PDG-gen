import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n*3];
        for(int i=0; i<n*3; i++){
            a[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(a);

        long ans = 0;
        for(int i=0; i<n; i++){
            ans += a[3*n - 2*i - 2];
        }
        System.out.println(ans);
    }
}        