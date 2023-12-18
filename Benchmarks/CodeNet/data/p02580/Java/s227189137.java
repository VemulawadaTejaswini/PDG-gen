import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int h = Integer.parseInt(sc.next());
                int w = Integer.parseInt(sc.next());
                int m = Integer.parseInt(sc.next());
                int[][] a = new int[2][m];
                int[] hc = new int[h];
                int[] wc = new int[w];
                Arrays.fill(hc , 0);
                Arrays.fill(wc , 0);
                int[][] map = new int[h][w];
                for(int i = 0 ; i < h ; i++){
                        Arrays.fill(map[i] , 0);
                }
                for(int i = 0 ; i < m ; i++){
                        for(int j = 0 ; j < 2 ; j++){
                                a[j][i] = Integer.parseInt(sc.next()) - 1;
                        }
                        map[a[0][i]][a[1][i]] = 1;
                        hc[a[0][i]]++;
                        wc[a[1][i]]++;
                }
                int hm = 0;
                int wm = 0;
                int[] hhh = new int[h];
                int[] www = new int[w];
                int hp = 0;
                int wp = 0;
                for(int i = 0 ; i < h ; i++){
                        if(hc[hm] < hc[i]) hm = i;
                }
                for(int i = 0 ; i < h ; i++){
                        if(hc[hm] == hc[i]){
                                hhh[hp] = i;
                                hp++;
                        }
                }
                for(int i = 0 ; i < w ; i++){
                        if(wc[wm] < wc[i]) wm = i;
                }
                for(int i = 0 ; i < w ; i++){
                        if(wc[wm] == wc[i]){
                                www[wp] = i;
                                wp++;
                        }
                }
                boolean ebishu = true;
                for(int i = 0 ; i < hp && ebishu ; i++){
                        for(int j = 0 ; j < wp && ebishu ; j++){
                                if(map[hhh[i]][www[j]] == 0){
                                        ebishu = false;
                                }
                        }
                }
                long yono = hc[hm] + wc[wm];
                if(ebishu) yono--;
                ou.print(yono + "\n");
                sc.close();
                ou.flush();
        }
}