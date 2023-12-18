import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nn = new int[n];
        for(int i=0; i<n; i++) {
            nn[i] = sc.nextInt();
        }
        int total = 0;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n-1; j++) {
                total += nn[i] * nn[j+1];
            }
        }
        System.out.println(total);
    }
}