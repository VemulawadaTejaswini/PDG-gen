import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        long min, max;
        long sum = 0;
        n = sc.nextInt();
        long[] a = new long[n];

        for(i = 0; i < a.length; i++){
            a[i] = sc.nextLong();
            sum += a[i];
        }

        min = a[0];
        max = a[0];

        for(i = 0; i < a.length; i++){
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        System.out.println(min + " " + max + " " + sum);
        sc.close();
    }
}


