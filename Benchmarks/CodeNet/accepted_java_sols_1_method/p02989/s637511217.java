import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int []d = new int[n];
        for (int i = 0;i<n;++i) d[i] = sc.nextInt();
        final int size = d.length;
        Arrays.sort(d);
        int a = d[size/2 - 1];
        int b = d[size/2];

        System.out.println(b-a);
        sc.close();
    }
}