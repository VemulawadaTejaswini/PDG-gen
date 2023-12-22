import java.util.*;
public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int [] ret = new int[n]; int temp = 0;
        for (int i = 0; i < n; i++) temp ^= a[i];
        for (int i = 0; i < n; i++) {
            ret[i] = temp ^ a[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ret[i] + " ");
        }
    }


}