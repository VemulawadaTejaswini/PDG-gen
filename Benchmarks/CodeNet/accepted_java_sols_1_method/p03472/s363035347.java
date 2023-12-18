import java.util.*;
import java.io.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                Map hs = new HashMap();
                PrintWriter ou = new PrintWriter(System.out);
                int n = Integer.parseInt(sc.next());
                int h = Integer.parseInt(sc.next());
                int[][] a = new int[2][n];
                for(int i = 0 ; i < n ; i++){
                        for(int j = 0 ; j < 2 ; j++){
                                a[j][i] = Integer.parseInt(sc.next());
                        }
                }
                for(int i = 0 ; i < 2 ; i++){
                        Arrays.sort(a[i]);
                }
                sc.close();
                int q = n - 1;
                long yono = 0;
                while(h > 0){
                        yono++;
                        if(q >= 0 && a[1][q] > a[0][n - 1]){
                                h -= a[1][q];
                                q--;
                        }else{
                                h -= a[0][n - 1];
                        }
                }
                ou.print(yono + "\n");
                ou.flush();
        }
}