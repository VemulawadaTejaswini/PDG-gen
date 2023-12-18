import java.util.*;


class Multiset<T> extends TreeMap<T,Long>{
    public Multiset(){
        super();
    }
    public Multiset(List<T> list){
        super();
        for(T e: list) this.addOne(e);
    }
    public long count(Object elm){
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
        this.add(elm, -this.count(elm));
    }
    public static<T> Multiset<T> merge(Multiset<T> a, Multiset<T> b){
        Multiset<T> c = new Multiset<>();
        for(T x: a.keySet()) c.add(x, a.count(x));
        for(T y: b.keySet()) c.add(y, b.count(y));
        return c;
    }
}

public class Main {
    static void printArray(int[] a){
        StringBuilder b = new StringBuilder();
        for(int i=0; i<a.length-1; i++){
            b.append(a[i]);
            b.append(" ");
        }
        b.append(a[a.length-1]);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A[] = new int[N];
        for(int n=0; n<N; n++) A[n] = sc.nextInt();
        int B[] = new int[N];
        for(int n=0; n<N; n++) B[N-1-n] = sc.nextInt();

        Multiset<Integer> sa = new Multiset<>();
        for(int n=0; n<N; n++) sa.addOne(A[n]);
        Multiset<Integer> sb = new Multiset<>();
        for(int n=0; n<N; n++) sb.addOne(B[n]);

        Multiset<Integer> s = Multiset.merge(sa,sb);

        for(int e:s.keySet()) if(s.count(e) > N){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");

        int l = -1, r = -1;
        for(int n=0; n<N; n++){
            if(l == -1 && A[n] == B[n]) l = n;
            if(l >= 0 && A[n] != B[n]) r = n;
        }
        if(r==-1) r=N;
        if(l>=0){
            int d = A[l];
            int i=l;
            for(int j=0; j<N; j++){
                if(A[j]==d || B[j]==d) continue;
                int tmp = B[j];
                B[j] = B[i];
                B[i] = tmp;
                i++;
                if(i >= r) break;
            }
        }
        printArray(B);
    }
}