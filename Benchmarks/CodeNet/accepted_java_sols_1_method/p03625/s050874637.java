import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int first = 0;
        int sec = 0;
        int pre = -1;
        for (int i = n-1; i >= 0; i--) {
            if(pre == a[i]){
                pre = -1;
                if(first == 0) first = a[i];
                else sec = a[i];
            }else{
                pre = a[i];
            }
            if(sec != 0) break;

        }

        System.out.println((long)first * sec);
        sc.close();
    }

}
