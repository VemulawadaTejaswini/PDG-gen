import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] a = new int[n];
            int max = -100000, min = 1000000;
            long sum = 0;

            for(int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if(a[i] > max) max = a[i];
                if(a[i] < min) min = a[i];
                sum += a[i];
            }
                System.out.println(min + " " + max + " " + sum);
            }
}