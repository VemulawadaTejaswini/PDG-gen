import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] p = new int[n][2];
        int l1=0,l2=0,r1=0,r2=0;
        for(int i=0;i<n;i++) {
        	String[] s = br.readLine().trim().split(" ");
        	p[i][0] = Integer.parseInt(s[0]);
        	p[i][1] = Integer.parseInt(s[1]);
        	if(p[i][0] < p[l1][0]) l1 = i;
            if(p[i][0] > p[l2][0]) l2 = i;
            if(p[i][1] < p[r1][1]) r1 = i;
            if(p[i][1] > p[r2][1]) r2 = i;
        }
        ArrayList<int[]> al = new ArrayList<>();
        int[] t1 = new int[] {p[l1][0], p[l1][1]};
        int[] t2 = new int[] {p[l2][0], p[l2][1]};
        int[] t3 = new int[] {p[r1][0], p[r1][1]};
        int[] t4 = new int[] {p[r2][0], p[r2][1]};
        al.add(t1);al.add(t2);al.add(t3);al.add(t4);
//        for(int[] i: al) {
//        	System.out.println(i[0]+" "+i[1]);
//        }
        long ans = 0;
        for(int i=0;i<4;i++) {
        	for(int j=0;j<4;j++) {
        		long d = man(al.get(i), al.get(j));
        		if(d > ans) ans = d;
        	}
        }
        System.out.println(ans);
    }
    public static long man(int[] a, int[] b) {
    	long d = 0;
    	d += (long)Math.abs(a[0]-b[0]);
    	d += (long)Math.abs(a[1]-b[1]);
    	return d;
    }
}
