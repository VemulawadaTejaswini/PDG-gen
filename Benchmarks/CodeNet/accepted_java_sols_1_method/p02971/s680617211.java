import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        int[] front = new int[n+1];
        int[] end = new int[n+1];

        for(int i = 1; i<n+1; i++) {
            front[i] = Math.max(front[i-1],a[i-1]);
            //System.out.println(front[i]);
        }
        for(int i = n-1; i>=0; i--) {
            end[i] = Math.max(end[i+1],a[i]);
            //System.out.println(end[i]);
        }

        for(int i = 0; i<n; i++) {
            //System.out.println(front[i] +" " + end[i+1]);
            System.out.println(Math.max(front[i], end[i+1]));
        }
    }
}