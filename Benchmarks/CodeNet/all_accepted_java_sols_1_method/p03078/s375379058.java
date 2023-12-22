import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        long[] array1 = new long[x * y];
        long[] array2;
        
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < y; i++) {
            b[i] = sc.nextLong();
        }
        for (int i = 0; i < z; i++) {
            c[i] = sc.nextLong();
        }
        
        int l = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array1[l] = a[i] + b[j];
                l++;
            }
        }
        Arrays.sort(array1);
        
        array2 = new long[Math.min(k, x * y) * z];
        l = 0;
        for (int i = array1.length - 1; i > array1.length - 1 - Math.min(k, x * y) ; i--) {
            for (int j = 0; j < z; j++) {
                array2[l] = array1[i] + c[j];
                l++;
            }
        }
        Arrays.sort(array2);
        
        for (int i = array2.length - 1; i > array2.length - 1 - k; i--) {
            System.out.println(array2[i]);
        }
    }
}
