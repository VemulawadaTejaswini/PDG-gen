import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        int sum = 0;
        for(int w:a) sum+=w;
        sum-=a[n-1];
        String ans = a[n-1]<sum?"Yes":"No";
        System.out.println(ans);
    }
}
