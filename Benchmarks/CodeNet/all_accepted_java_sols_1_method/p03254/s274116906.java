import java.util.Arrays;
import java.util.Scanner;

// 22
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int umaibo = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);
        int i = 0;
        for( ; i < n; i++) {
            umaibo -= a[i];
            if(umaibo < 0) break;
        }
        if(umaibo > 0) --i;

        System.out.println(i);
    }

}
