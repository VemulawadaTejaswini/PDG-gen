import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n == 0 && m == 0) break;
            
            int[] ns = new int[n];
            int[] ms = new int[m];
            int nsum = 0;
            int msum = 0;
            
            for(int i=0; i<n; i++) {
                ns[i] = sc.nextInt();
                nsum += ns[i];
            }
            for(int i=0; i<m; i++) {
                ms[i] = sc.nextInt();
                msum += ms[i];
            }
            
            int sn = -1;
            int sm = -1;
            
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(nsum - ns[i] + ms[j] == msum - ms[j] + ns[i]) {
                        if(sn == -1) {
                            sn = ns[i];
                            sm = ms[j];
                        }
                        else if(ns[i] + ms[j] < sn + sm) {
                            sn = ns[i];
                            sm = ms[j];
                        }
                    }
                }
            }
            System.out.println(sn==-1?sn:sn+" "+sm);
        }
    }
}

