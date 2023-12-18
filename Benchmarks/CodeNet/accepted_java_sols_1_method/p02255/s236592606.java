import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        for (int i=0; i<n; i++) {
            ary[i] = sc.nextInt();
        }
        
        for (int i=0; i<n; i++) {
            int val = ary[i];
            for (int j=i-1; j>-1; j--) {
                if (ary[j+1] < ary[j]) {
                    ary[j+1] = ary[j];
                    ary[j] = val;
                } else {
                    break;
                }
            }
            for (int k=0;k<n;k++) {
                System.out.print(ary[k]);
                if (k!=n-1) {
                    System.out.print(" ");
                } else {
                    System.out.println("");
                }
            }
        }
    }
}