import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.geom.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    static Scanner sc=new Scanner(in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] d=new int[n];
        int ans=0;
        for (int i = 0; i < n; i++) {
            d[i]=sc.nextInt();
        }
        Arrays.sort(d);
        ans=max(0,d[n/2]-d[n/2-1]);
        out.println(ans);
    }
}