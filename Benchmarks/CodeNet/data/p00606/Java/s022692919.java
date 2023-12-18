import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String[] ia; 

                while(true){
                        n = Integer.parseInt(in.readLine());
                        if(n == 0){ 
                                break;
                        }   
                        ia = in.readLine().split(" ");
                        s = ia[0].charAt(0) - 'A';
                        t = ia[1].charAt(0) - 'A';
                        b = ia[2].charAt(0) - 'A';
                        e = 0;
                        f = 0;
                        x = new Integer[9][16][2];
                        check(n, s); 
                        System.out.printf("%.8f\n",(double) x[s][n][0]/x[s][n][1]);
                }   
        }   
        static int n;
        static int s;
        static int t;
        static int b;
        static Integer[][][] x;
        static int e;
        static int f;
        static class pair{
                int a;
                int b;
                pair(Integer s, Integer t){ 
                        a = s;
                        b = t;
                }   
                pair(int s, int t){ 
                        a = s;
                        b = t;
                }   
                void add(pair s){ 
                        this.a += s.a;
                        this.b += s.b;
                }
        }
        static pair check(int g, int h){
                if(x[h][g][0] != null){
                        return new pair(x[h][g][0],x[h][g][1]);
                }
                pair p = new pair(0,0);
                if(g == 0){
                        p.b++;
                        if(h == t){
                                p.a++;
                        }
                } else {
                        if(2 < h){
                                if(h-3 != b){
                                        p.add(check(g-1, h-3));
                                } else {
                                        p.add(check(g-1, h));
                                }
                        } else {
                                p.add(check(g-1, h));
                        }
                        if(0 < h%3){
                                if(h-1 != b){
                                        p.add(check(g-1, h-1));
                                } else {
                                        p.add(check(g-1, h));
                                }
                        } else {
                                p.add(check(g-1, h));
                        }
                        if(h%3 < 2){
                                if(h+1 != b){
                                        p.add(check(g-1, h+1));
                                } else {
                                        p.add(check(g-1, h));
                                }
                        } else {
                                p.add(check(g-1, h));
                        }
                        if(h < 6){
                                if(h+3 != b){
                                        p.add(check(g-1, h+3));
                                } else {
                                        p.add(check(g-1, h));
                                }
                        } else {
                                p.add(check(g-1, h));
                        }
                }
                x[h][g][0] = p.a;
                x[h][g][1] = p.b;
                return p;
        }
}