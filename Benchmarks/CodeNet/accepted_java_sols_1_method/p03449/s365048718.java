import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arraya = new int[n];
        for (int i = 0; i < n; i++) {
            arraya[i] = sc.nextInt();
        }
        int[] arrayb = new int[n];
        for (int i = 0; i < n; i++) {
            arrayb[i] = sc.nextInt();
        }
        
        int[] suma = new int[n];
        suma[0] = arraya[0];
        for (int i = 1; i < n; i++) {
            suma[i] = suma[i-1] + arraya[i];
        }
        // System.out.println(Arrays.toString(suma));
        
        int[] sumb = new int[n];
        sumb[n-1] = arrayb[n-1];
        for (int i = n-2; i >= 0; i--) {
            sumb[i] = sumb[i+1] + arrayb[i];
        }
        // System.out.println(Arrays.toString(sumb));
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, suma[i] + sumb[i]);
        }
        System.out.println(max);
    }
}
