import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(a[i] >= 5 && b[i] >= 2) System.out.println((x[i] * a[i] + y[i] * b[i]) * 4 / 5);
            else if(a[i] >= 5) System.out.println((int) (Math.min(x[i] * a[i] + y[i] * b[i], (x[i] * a[i] + y[i] * 2) * 4 / 5)));
            else if(b[i] >= 2) System.out.println((int) (Math.min(x[i] * a[i] + y[i] * b[i], (x[i] * 5 + y[i] * b[i]) * 4 / 5)));
            else System.out.println((int) (x[i] * a[i] + y[i] * b[i]));
        }
        scan.close();
    }
}
