import java.util.*;
public class Main{
    
    static final int MAX = (int)3e5+3;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(sc.next())+1;
        }
        
        ExBinaryIndexedTree ebit = new ExBinaryIndexedTree(MAX);
        for(int x : a){
            int l = Math.max(1, x-k);
            int r = Math.min((int)3e5+1, x+k);
            ebit.add(l, r, 1);
        }
        
        long max = 0;
        for(int i=1; i<n; i++){
            long tmp = ebit.get(a[i]+1) - ebit.get(a[i]);
            //System.out.println(tmp);
            max = Math.max(max, tmp);
        }
        System.out.println(max);
    }
}


class BinaryIndexedTree{
    int size;
    long[] tree;
    
    public BinaryIndexedTree(int n){
        this.size = n;
        this.tree = new long[n+1];
    }
    
    public long get(int i){
        long s = 0L;
        while(0<i){
            s += tree[i];
            i -= i & -i;
        }
        return s;
    }
    
    public void add(int i, long x){
        while(i<=size){
            tree[i] += x;
            i += i & -i;
        }
    }
}

class ExBinaryIndexedTree{
    BinaryIndexedTree p,q;
    
    public ExBinaryIndexedTree(int n){
        p = new BinaryIndexedTree(n+1);
        q = new BinaryIndexedTree(n+1);
    }
    
    public void add(int l, int r, long w){
        p.add(l, -w * l);
        p.add(r, w * r);
        q.add(l, w);
        q.add(r, -w);
    }
    
    public long get(int r){
        return p.get(r) + q.get(r) * r;
    }
}