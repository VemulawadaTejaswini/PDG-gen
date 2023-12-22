import java.util.*;
import java.io.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int h = Integer.parseInt(sc.next());
                int w = Integer.parseInt(sc.next());
                int[][] a = new int[h][w];
                int[][] cp = new int[h][w];
                for(int i = 0 ; i < h ; i++){
                        String s = sc.next();
                        for(int j = 0 ; j < w ; j++){
                                if(s.charAt(j) == '#') a[i][j] = -(int)Math.pow(10 , 5);
                                else a[i][j] = (int)Math.pow(10 , 5);
                                cp[i][j] = a[i][j];
                        }
                }
                int yono = 0;
                for(int i = 0 ; i < h ; i++){
                        for(int j = 0 ; j < w ; j++){
                                if(cp[i][j] != -(int)Math.pow(10 , 5)){
                                        cp[i][j] = 0;
                                        for(int k = 0 ; k < h * w ; k++){
                                                for(int ebi = 0 ; ebi < h ; ebi++){
                                                        for(int shu = 0 ; shu < w ; shu++){
                                                                if(cp[ebi][shu] >= 0){
                                                                        if(ebi != 0 && cp[ebi - 1][shu] >= 0) cp[ebi - 1][shu] = Math.min(cp[ebi][shu] + 1 , cp[ebi - 1][shu]);
                                                                        if(shu != 0 && cp[ebi][shu - 1] >= 0) cp[ebi][shu - 1] = Math.min(cp[ebi][shu] + 1 , cp[ebi][shu - 1]);
                                                                        if(ebi != h - 1 && cp[ebi + 1][shu] >= 0) cp[ebi + 1][shu] = Math.min(cp[ebi][shu] + 1 , cp[ebi + 1][shu]);
                                                                        if(shu != w - 1 && cp[ebi][shu + 1] >= 0) cp[ebi][shu + 1] = Math.min(cp[ebi][shu] + 1 , cp[ebi][shu + 1]);
                                                                }
                                                        }
                                                }
                                        }
                                        for(int ebi = 0 ; ebi < h ; ebi++){
                                                for(int shu = 0 ; shu < w ; shu++){
                                                        if(cp[ebi][shu] >= 0 && cp[ebi][shu] != (int)Math.pow(10 , 5)) yono = Math.max(yono , cp[ebi][shu]);
                                                }
                                        }
                                        for(int ebi = 0 ; ebi < h ; ebi++){
                                                for(int shu = 0 ; shu < w ; shu++){
                                                        cp[ebi][shu] = a[ebi][shu];
                                                }
                                        }
                                }
                        }
                }
                ou.print(yono + "\n");
                ou.flush();
        }
}