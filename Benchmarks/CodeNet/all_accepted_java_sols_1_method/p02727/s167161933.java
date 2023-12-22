import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] p = new int[a];
        int[] q = new int[b];
        int[] r = new int[c];

        for(int i=0; i<a; i++) {
            p[i] = sc.nextInt();
        }
        for(int i=0; i<b; i++) {
            q[i] = sc.nextInt();
        }
        for(int i=0; i<c; i++) {
            r[i] = sc.nextInt();
        }

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        int ai = a - x;
        int bi = b - y;
        int ci = c - 1;

        while(true) {
            if(ai == a && bi == b || ci == -1) break;
            if(bi == b) {
                if(p[ai] < r[ci]) {
                    p[ai++] = r[ci--];
                    continue;
                } else {
                    break;
                }
            }
            if(ai == a) {
                if(q[bi] < r[ci]) {
                    q[bi++] = r[ci--];
                    continue;
                } else {
                    break;
                }
            }
            int da = r[ci] - p[ai];
            int db = r[ci] - q[bi];
            if(da < 0 && db < 0) break;
            if(da > db) {
                p[ai++] = r[ci--];
            } else {
                q[bi++] = r[ci--];
            }
        }



        long res = 0;
        for(int i=0; i<x; i++) {
            res += p[a-1-i];
        }
        for(int i=0; i<y; i++) {
            res += q[b-1-i];
        }
        System.out.println(res);

    }



}