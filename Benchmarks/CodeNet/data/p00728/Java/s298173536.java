import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true) {
            int n = s.nextInt();
            if (n==0) break;
            int[] a=new int[n];
            for (int i=0;i<a.length;i++) {
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            int sum=0;
            for (int i=1;i<a.length-1;i++) {
                sum+=a[i];
            }
            System.out.println(sum/(a.length-2));
        }
    }
}