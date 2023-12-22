import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        int[] a = new int[N];
 
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
 
        int alice = 0;
        int bob = 0;
 
        Arrays.sort(a);
        int index = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (index % 2 == 0)
                alice += a[i];
            else
                bob += a[i];
 
            index++;
        }
 
        System.out.println(alice - bob);
        sc.close();
    }
}