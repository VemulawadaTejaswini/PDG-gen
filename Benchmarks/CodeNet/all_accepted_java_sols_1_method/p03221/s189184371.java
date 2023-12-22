import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        long[] a = new long[m];
        long[] d = new long[m];
        int[] g = new int[n];
        HashMap<Long,Integer> b = new HashMap<Long, Integer>();
        HashMap<Long, String> c  = new HashMap<Long, String>();

        for (int i=0;i<m;i++){
            int p = scan.nextInt();
            long y = scan.nextLong();
            b.put(y,p);
            a[i] = y;
            d[i] = y;
        }

        Arrays.sort(a);

        for (int j=0;j<m;j++){
            int p1 = b.get(a[j]);
            int p2 = g[p1-1]+1;
            g[p1-1] += 1;
            String a1 = "";
            String a2 = p1+"";
            String a3 = p2+"";
            for (int k1=0;k1<6-a2.length();k1++){
                a1 += "0";
            }
            a1 += a2;
            for (int k2=0;k2<6-a3.length();k2++){
                a1 += "0";
            }
            a1 += a3;
            c.put(a[j], a1);
        }

        for (int q = 0 ; q<m;q++){
            System.out.println(c.get(d[q]));
        }
    }
}