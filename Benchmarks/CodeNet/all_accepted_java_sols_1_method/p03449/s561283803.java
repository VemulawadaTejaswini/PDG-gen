import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        
        int sum = a1[0];
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
            sum += a2[i];
        }
        
        int max = sum;
        
        for (int i = 1; i < n; i++) {
            sum = sum + a1[i] - a2[i - 1];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}