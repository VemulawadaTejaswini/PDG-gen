import java.util.*;
import java.util.function.*;
import java.io.*;

class SegTree<S>{
    BiFunction<S,S,S> op;
    S e;

    private int _n;
    private int size;
    private int log;
    private ArrayList<S> d;

    public SegTree(BiFunction<S,S,S> op, S e, S[] v){
        this.op = op;
        this.e = e;
        _n = v.length;
        log = 0; while((1<<log)<_n){log++;} //int log = ceil_pow2(_n);
        size = 1 << log;
        d = new ArrayList<>(2*size);
        for(int i=0; i<2*size; i++) d.add(e);
        for(int i=0; i<_n; i++) d.set(size+i, v[i]);
        for(int i=size-1; i>=1; i--) update(i);        
    }
    public SegTree(BiFunction<S,S,S> op, S e, List<S> v){
        this.op = op;
        this.e = e;
        _n = v.size();
        log = 0; while((1<<log)<_n){log++;} //int log = ceil_pow2(_n);
        size = 1 << log;
        d = new ArrayList<>(2*size);
        for(int i=0; i<2*size; i++) d.add(e);

        //定数時間accessでないListを考えてループ対象を変更
        int j=0;
        for(S s:v){
            d.set(size+j, s);
            j++;
        }

        for(int i=size-1; i>=1; i--) update(i); 
    }
    public SegTree(BiFunction<S,S,S> op, S e, int n){
        this.op = op;
        this.e = e;
        _n = n;
        log = 0; while((1<<log)<_n){log++;} //int log = ceil_pow2(_n);
        size = 1 << log;
        d = new ArrayList<>(2*size);
        for(int i=0; i<2*size; i++) d.add(e);
        for(int i=size-1; i>=1; i--) update(i);
    }
    public SegTree(BiFunction<S,S,S> op, S e){
        this(op, e, 0);
    }

    public void set(int p, S x){
        assert(0 <= p && p < _n);
        p += size;
        d.set(p, x);
        for(int i=1; i <= log; i++) update(p>>i);
    }
    public S get(int p){
        assert(0 <= p && p < _n);
        return d.get(p+size);
    }
    public S prod(int l, int r){
        assert(0<=l && l<=r && r<=_n);
        S sml = e, smr = e;
        l += size;
        r += size;

        while(l<r){
            if((l&1) > 0) sml = op.apply(sml, d.get(l++));
            if((r&1) > 0) smr = op.apply(d.get(--r), smr);
            l >>= 1;
            r >>= 1;
        }
        return op.apply(sml, smr);
    }
    public S all_prod(){
        return d.get(1);
    }

    public int max_right(int l, Function<S, Boolean> f){
        assert(0<=l && l<=_n);
        assert(f.apply(e));
        if(l==_n) return _n;
        l += size;
        S sm = e;
        do {
            while(l%2 == 0) l >>= 1;
            if (!f.apply(op.apply(sm, d.get(l)))){
                while(l < size){
                    l = 2*l;
                    if(f.apply(op.apply(sm, d.get(l)))){
                        sm = op.apply(sm, d.get(l));
                        l++;
                    }
                }
                return l-size;
            }
            sm = op.apply(sm, d.get(l));
            l++;
        }while((l&(-l)) != l);
        return _n;
    }

    public int min_left(int r, Function<S, Boolean> f){
        assert(0<=r && r<=_n);
        assert(f.apply(e));
        if(r==0) return 0;
        r += size;
        S sm = e;
        do {
            r--;
            while(r>1 && (r%2>0)) r >>= 1;
            if(!f.apply(op.apply(d.get(r), sm))){
                while(r<size){
                    r = 2*r+1;
                    if(f.apply(op.apply(d.get(r), sm))){
                        sm = op.apply(d.get(r), sm);
                        r--;
                    }
                }
                return r+1-size;
            }
            sm = op.apply(d.get(r), sm);
        } while ((r & -r) != r);
        return 0;
    }

    private void update(int k){
        d.set(k, op.apply(d.get(2*k), d.get(2*k+1)));
    }
}

public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Q = sc.nextInt();

        //ArrayList<Long> A = new ArrayList<>();
        //for(int n=0; n<N; n++) A.add(sc.nextLong());

        Long[] A = new Long[N];
        for(int n=0; n<N; n++) A[n]=sc.nextLong();

        SegTree<Long> seg = new SegTree<>(Math::max, 1L, A);
        
        for(int q=0; q<Q; q++){
            int t = sc.nextInt();
            if(t==1){
                int x = sc.nextInt()-1;
                long v = sc.nextLong();
                seg.set(x,v);
            }else if(t==2){
                int l = sc.nextInt()-1;
                int r = sc.nextInt()-1;
                System.out.println(seg.prod(l, r+1));
            }else if(t==3){
                int x = sc.nextInt()-1;
                long v = sc.nextLong();
                System.out.println(1 + seg.max_right(x, a->(a<v)));
            }
        }
    }
}
