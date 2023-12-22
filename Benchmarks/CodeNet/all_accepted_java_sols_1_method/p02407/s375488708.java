import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(i = n-1; i >= 0; i--) {
            System.out.print(a[i]);
            if(i > 0){
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
