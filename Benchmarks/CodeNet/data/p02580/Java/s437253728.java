import java.util.*;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] hs = new int[h];
        int[] ws = new int[w];
        int m = sc.nextInt();
        int[] xa = new int[m];
        int[] ya = new int[m];

        for(int i=0; i<m; i++) {
            xa[i] = sc.nextInt()-1;
            ya[i] = sc.nextInt()-1;
            hs[xa[i]]++;
            ws[ya[i]]++;
        }

        int hmax = 0;
        boolean[] hb = new boolean[h];
        for(int i=0; i<h; i++) {
            hmax = Math.max(hmax, hs[i]);
        }
        ArrayList<Integer> xi = new ArrayList<>();
        for(int i=0; i<h; i++) {
            if(hs[i] == hmax) {
                xi.add(i);
                hb[i] = true;
            }
        }
        int wmax = 0;
        boolean[] wb = new boolean[w];
        for(int i=0; i<w; i++) {
            wmax = Math.max(wmax, ws[i]);
        }
        ArrayList<Integer> yi = new ArrayList<>();
        for(int i=0; i<w; i++) {
            if(ws[i] == wmax) {
                yi.add(i);
                wb[i] = true;
            }
        }
        long count = 0;
        for(int i=0; i<m; i++) {
            if(hb[xa[i]] && wb[ya[i]]) {
                count++;
            }
        }
        if(count == (long)yi.size() * xi.size()) {
            System.out.println(hmax + wmax - 1);
        } else {
            System.out.println(hmax + wmax);

        }

    }
}