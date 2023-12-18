import java.util.Scanner;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n, i, min, max;
        int sum = 0;
        n = sc.nextInt();
        int[] a = new int[n];
        for(i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        min = a[0];
        max = a[0];
        for(i = 1; i < a.length; i++){
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        System.out.println(min + " " + max + " " + sum);
        sc.close();
    }
}

