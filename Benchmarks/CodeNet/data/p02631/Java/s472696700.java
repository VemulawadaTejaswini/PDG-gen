import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] arr = new int[N];
        int a;
        a = arr[0] = sc.nextInt();
        for(int i = 1; i < N; i++) {
            arr[i] = sc.nextInt();
            a ^= arr[i];
        }
        for(int i = 0; i < N; i++) {
            System.out.print(a ^ arr[i]);
            System.out.print(" ");
        }
    }
}