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
        int[] p=new int[n];
        for (int i = 0; i < n; i++) {
            p[i]=sc.nextInt();
        }
        int ans=0;
        for (int i = 0; i < n - 2; i++)
            if (p[i] + p[i + 1] + p[i + 2] - min(p[i], min(p[i + 1], p[i + 2])) - max(p[i], max(p[i + 1], p[i + 2])) == p[i + 1])
                ans++;
            out.println(ans);
    }
}