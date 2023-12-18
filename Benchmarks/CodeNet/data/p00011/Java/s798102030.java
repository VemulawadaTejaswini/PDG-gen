import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] v = new int[w];
        
        for (int i = 0; i < w; i++) {
            v[i] = i+1;
        }
        for (int i = 0; i < n; i++) {
            String[] s = sc.next().split(",",0);
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            a--;b--;
            int buf = v[a] ;
            v[a] = v[b];
            v[b] = buf;
        }

        sc.close();
        printary(v);
    }
    
    public static void printary(int[] a)
    {
        for ( int i = 0; i < a.length; i++) {
            if(i>0) System.out.println();
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
