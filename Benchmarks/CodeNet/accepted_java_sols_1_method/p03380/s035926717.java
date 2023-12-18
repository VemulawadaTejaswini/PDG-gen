import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        int mid = 0;
        int x = (max + 1) / 2;
        for(int i = 0; i < n; i++){
            if(Math.abs(a[i] - x) < Math.abs(mid - x)){
                mid = a[i];
            }
        }
        System.out.println(max + " " + mid);
    }
}
