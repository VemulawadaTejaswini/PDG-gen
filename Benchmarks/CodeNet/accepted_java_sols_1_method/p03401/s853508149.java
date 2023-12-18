import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n + 2;
        int[] a = new int[m];
        a[0] = a[m - 1] = 0;
        for(int i=0; i<n; i++) {
            a[i+1] = sc.nextInt();
        }
        int d = 0;
        for(int i=0; i+1<m; i++) {
            d += Math.abs(a[i+1] - a[i]);
        }
        for(int i=0; i<n; i++) {
            System.out.println(d - Math.abs(a[i+2]-a[i+1]) - Math.abs(a[i+1]-a[i]) + Math.abs(a[i+2]-a[i]));
        }
    }

}
