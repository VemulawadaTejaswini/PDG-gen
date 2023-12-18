import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count = new int[n+1];
        for(int i=1; i<n; i++) {
            a[i] = sc.nextInt();
            count[a[i]] += 1;
        }

        for(int i=1; i<n+1; i++) {
            System.out.println(count[i]);
        }

        
    }
}
