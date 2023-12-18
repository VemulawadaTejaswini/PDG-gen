import java.io.*;
import java.util.*;

public class Main {
    
    static final int NIL = -1;
    static int np;
    static Point[] P;
    static Node[] T;
    static List<Integer> list;
    static Random rand;

    public static void main(String[] args) {
        
        FastScanner sc = new FastScanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        P = new Point[n];
        T = new Node[n];
        for(int i = 0; i < n; i++){
            P[i] = new Point(i, Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
            T[i] = new Node();
        }
        np = 0;
        rand = new Random();
        
        make2DTree(0, n, 0);
        
        int q = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            list = new ArrayList<>();
            if(n != 0){
                find(0, Integer.parseInt(sc.next()), Integer.parseInt(sc.next()),
                        Integer.parseInt(sc.next()), Integer.parseInt(sc.next()), 0);
            }
            Collections.sort(list);
            list.forEach((j) -> {
                sb.append(j).append(System.lineSeparator());
            });
            sb.append(System.lineSeparator());
        }
        System.out.print(sb);
    }
    
    static int make2DTree(int l, int r, int depth){
        
        if(!(l < r)) return NIL;
        
        int mid = (l+r) / 2;
        int t = np++;
        
        if(depth % 2 == 0){
            select(P, mid-l, l, r-1, depth);
        }else{
            select(P, mid-l, l, r-1, depth);
        }
        
        T[t].location = mid;
        T[t].l = make2DTree(l, mid, depth+1);
        T[t].r = make2DTree(mid+1, r, depth+1);
        
        return t;
    }
    
    static int select(Point[] a, int k, int l, int r, int depth){
        
        int p = l;
        while(true){
            int pivot = p + rand.nextInt(r-p+1);
            Point tmp = a[pivot];
            a[pivot] = a[r];
            a[r] = tmp;
            int i = partition(a, p, r, depth);
            if(i-l == k){
                return i;
            }else if(i-l > k){
                r = i-1;
            }else{
                p = i+1;
            }
        }
    }
    
    static int partition(Point[] a, int p, int r, int depth){
        
        int i = p-1;
        boolean b = true;
        if(depth % 2 == 0){
            int x = a[r].x;
            for(int j = p; j < r; j++){
                if(a[j].x <= x){
                    if(a[j].x == x){
                        b = !b;
                        if(b) continue;
                    }
                    i++;
                    Point tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }else{
            int y = a[r].y;
            for(int j = p; j < r; j++){
                if(a[j].y <= y){
                    if(a[j].y == y){
                        b = !b;
                        if(b) continue;
                    }
                    i++;
                    Point tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        Point tmp = a[i+1];
        a[i+1] = a[r];
        a[r] = tmp;
        return i+1;
    }
    
    static void find(int v, int sx, int tx, int sy, int ty, int depth){
        
        int x = P[T[v].location].x;
        int y = P[T[v].location].y;
        
        if(sx <= x && x <= tx && sy <= y && y <= ty){
            list.add(P[T[v].location].id);
        }
        
        if(depth % 2 == 0){
            if(T[v].l != NIL && sx <= x){
                find(T[v].l, sx, tx, sy, ty, depth+1);
            }
            if(T[v].r != NIL && x <= tx){
                find(T[v].r, sx, tx, sy, ty, depth+1);
            }
        }else{
            if(T[v].l != NIL && sy <= y){
                find(T[v].l, sx, tx, sy, ty, depth+1);
            }
            if(T[v].r != NIL && y <= ty){
                find(T[v].r, sx, tx, sy, ty, depth+1);
            }
        }
    }
    
    static class Node {
        int location, l, r;
    }
    
    static class Point {
        int id, x, y;

        public Point(int id, int x, int y) {
            this.id = id;
            this.x = x;
            this.y = y;
        }
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        
        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
        String next(){
            while(st == null || !st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch(IOException  e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    }
}
