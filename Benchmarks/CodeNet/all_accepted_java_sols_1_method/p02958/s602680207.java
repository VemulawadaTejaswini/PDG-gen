import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int count=0;
        for (int i=0; i<n; i++) {
            if (i+1 != a[i]) {
                count++;
            }
        }
        if (count<=2) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
