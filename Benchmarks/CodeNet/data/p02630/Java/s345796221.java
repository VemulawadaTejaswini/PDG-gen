import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;

class Counter<T> extends TreeMap<T,Long>{
    public Counter(){
        super();
    }
    public Counter(List<T> list){
        super();
        for(T e: list) this.addOne(e);
    }
    public Long count(Object elm){
        return getOrDefault(elm,0L);
    }
    public void add(T elm, long amount){
        if(!this.containsKey(elm)) put(elm, amount);
        else replace(elm, get(elm)+amount);
        if(this.count(elm)==0) this.remove(elm);
    }
    public void addOne(T elm){
        this.add(elm, 1);
    }
    public void removeOne(T elm){
        this.add(elm, -1);
    }
    public void removeAll(T elm){
        this.add(elm, this.count(elm));
    }
    public static<T> Counter<T> merge(Counter<T> a, Counter<T> b){
        Counter<T> c = new Counter<>();
        for(T x: a.keySet()) c.add(x, a.count(x));
        for(T y: b.keySet()) c.add(y, b.count(y));
        return c;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Counter<Long> A = new Counter<>();
        long total = 0;
        for(int n=0; n<N; n++){
            long e = sc.nextLong();
            A.addOne(e);
            total += e;
        } 

        int Q = sc.nextInt();
        for(int q=0; q<Q; q++) {
            long B = sc.nextLong();
            long C = sc.nextLong();

            long m = A.count(B);
            A.removeAll(B);
            A.add(C, m);
            total = total - B*m + C*m;
            System.out.println(total);
        }
        
        
    }
}
