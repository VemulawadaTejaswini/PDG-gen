import java.util.*;
import java.lang.*;


public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int flag = 1;
        int count = 0;
        while(flag == 1) {
            flag = 0;
            for (int j = n - 1; 0 < j; j--) {
                if (a[j] < a[j - 1]) {
                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                    flag = 1;
                    count++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i != n - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
        System.out.println(count);
    }
}

