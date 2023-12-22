import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System .in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long max1 = a>b?a:b;
        long min1 = a<=b?a:b;
        int c = sc.nextInt();
        int d = sc.nextInt();
        long max2 = c>d?c:d;
        long min2 = c<=d?c:d;
        long max = Math.max(Math.max(Math.max(max1*max2,min1*min2),max1*min2),min1*max2);
        System.out.println(max);
    }
}