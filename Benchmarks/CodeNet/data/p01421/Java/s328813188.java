import java.io.*;
import java.util.*;
import java.math.*;
 
public class Main {
 
        Scanner sc = new Scanner(System.in);
 
        class E {
                int from;
                int to;
                int flow = 0;
 
                E(int a, int b) {
                        from = a;
                        to = b;
                }
        }
 
        boolean dfs(int s, int t, boolean[] used, LinkedList<E> e) {
//              int n = used.length;
//              System.out.println(s);
                if(s==t){
                        return true;
                }
                        
                for (E v : e) {
                        if (v.from == s) {
                                if (!used[v.to]) {
                                        if (v.flow == 0) {
                                                v.flow = 1;
                                                used[v.to] = true;
 
                                                if (dfs(v.to, t, used, e)) {
                                                        return true;
                                                } else {
                                                        v.flow = 0;
                                                }
                                        }
                                }
                        }
 
                        if (v.to == s) {
                                if (!used[v.from]) {
                                        if (v.flow == 1) {
                                                v.flow = 0;
                                                used[v.from] = true;
 
                                                if (dfs(v.from, t, used, e)) {
                                                        return true;
                                                } else {
                                                        v.flow = 1;
                                                }
                                        }
                                }
                        }
                }
                return false;
        }
 
        void run() {
                int n = sc.nextInt();
                int m = sc.nextInt();
 
                LinkedList<E> e = new LinkedList<E>();
 
                for (int i = 0; i < m; i++) {
                        int u = sc.nextInt() - 1;
                        int v = sc.nextInt() - 1;
 
                        e.add(new E(u, v));
                        e.add(new E(v, u));
                }
 
                int s = sc.nextInt() - 1;
                int t = sc.nextInt() - 1;
 
                long ans1 = 0;
 
                for (;;) {
                        boolean used[] = new boolean[n];
 
                        if (!dfs(s, t, used, e)) {
                                break;
                        }
                        ;
                        ans1++;
                }
 
                System.out.println(ans1);
                
                LinkedList<Integer> as = new LinkedList<Integer>();
                
                for(int i =0 ; i < m; i++){
                        E a = e.poll();
                        E b = e.poll();
                        
                        if(a.flow < b.flow){
                                as.add(i+1);
                        }
                }
                System.out.println(as.size()
                                );
                for(int k : as){
                        System.out.println(k);
 
                }
 
        }
 
        public static void main(String[] args) {
                Main m = new Main();
                m.run();
        }
 
}
 