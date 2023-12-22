import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int h = Integer.parseInt(sc.next());
                int w = Integer.parseInt(sc.next());
                int[][] c = new int[10][10];
                for(int i = 0 ; i <= 9 ; i++){
                        for(int j = 0 ; j <= 9 ; j++){
                                c[i][j] = Integer.parseInt(sc.next());
                        }
                }
                int yono = h * w;
                int[][] a = new int[h][w];
                for(int i = 0 ; i < h ; i++){
                        for(int j = 0 ; j < w ; j++){
                                a[i][j] = Integer.parseInt(sc.next());
                                if(a[i][j] == -1) yono--;
                        }
                }
                sc.close();
                int[] q = new int[yono];
                yono = 0;
                for(int i = 0 ; i < h ; i++){
                        for(int j = 0 ; j < w ; j++){
                                if(a[i][j] != -1){
                                        q[yono] = a[i][j];
                                        yono++;
                                }
                        }
                }
                for(int i = 0 ; i <= 9 ; i++){
                        for(int j = 0 ; j <= 9 ; j++){
                                for(int k = 0 ; k <= 9 ; k++){
                                        c[j][k] = Math.min(c[j][k] , c[j][i] + c[i][k]);
                                }
                        }
                }
                long ebishu = 0;
                for(int i = 0 ; i < yono ; i++){
                        ebishu += c[q[i]][1];
                }
                ou.print(ebishu + "\n");
                ou.flush();
        }
}