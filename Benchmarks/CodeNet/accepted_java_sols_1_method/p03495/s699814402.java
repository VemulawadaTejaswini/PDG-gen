import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[sc.nextInt()-1] += 1;
        }

        Arrays.sort(a);

        int[] b = new int[a.length];
        for(int i=0; i<a.length; i++) {
            b[i] = a[a.length-1-i];
        }

        //System.out.println(Arrays.toString(b));

        int count = 0;
        int target = 0;
        for(int i=0; i<b.length; i++) {
            if(b[i] > 0) {
                count += 1;
            }
            if(count > k) {
                target += b[i];
            }
        }
        if(count > k) {
            System.out.println(target);
        } else {
            System.out.println(0);
        }
    }
}
