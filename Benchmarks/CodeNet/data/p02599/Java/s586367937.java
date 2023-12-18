

import java.util.*;
import java.io.*;
import java.util.Random;
import java.util.spi.AbstractResourceBundleProvider;


public class Main
{
    static int[] c = new int[1000000];
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int n = in.nextInt();int q = in.nextInt();
        for(int i=0;i<n;i++){
            c[i] = in.nextInt();
        }
        Pair[] query = new Pair[q];

        for(int i=0;i<q;i++){
            int l =in.nextInt();int r = in.nextInt();
            query[i] = (new Pair(l,r,i));
        }
        Compare obj = new Compare();
        obj.compare(query,q);

        BIT bit = new BIT(n);
        int[] lastvis = new int[n+1];
        for(int i=0;i<=n;i++){
            lastvis[i] = -1;
        }
        int[] ans = new int[n];
        int ind = 0;

        for(int i=0;i<n;i++){
            if(lastvis[c[i]] !=-1){
                bit.update(lastvis[c[i]]+1,-1);
            }
            lastvis[c[i]] = i;
            bit.update(i+1,1);
            while(ind<q && query[ind].r == i+1){
                ans[query[ind].idx] = bit.sum(i+1) - bit.sum((int) (query[ind].l-1));
                ind++;
            }
        }
        for(int i= 0 ;i<q;i++){
            System.out.println(ans[i]);
        }

    }


    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
class Pair {
    long l;
    long r;
    int idx;

    // Constructor
    public Pair(long l,long r,int idx)
    {
        this.l = l;
        this.r = r;
        this.idx = idx;
    }
}

class BIT{
    int n;
    int[] tree;
    public BIT(int n) {
        this.n = n;
        this.tree = new int[n+1];
        for(int i=0;i<=n;i++){
            this.tree[i] = 0;
        }
    }

    public int sum(int x){
        int sum = 0;
        while (x>0){
            sum+= this.tree[x];
            x-=x&(-x);
        }
        return sum;
    }

    public void update(int x,int k){
        while (x<=this.n){
            this.tree[x]+=k;
            x+=x&(-x);
        }
    }

}

// class to define user defined conparator
class Compare {

    static void compare(Pair[] arr, int n)
    {
        // Comparator to sort the pair according to second element
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override public int compare(Pair p1, Pair p2)
            {
                if(p1.r==p2.r){
                    return (int) (p1.l-p2.l);
                }
                else
                    return (int) (p1.r - p2.r);
            }
        });
//        return arr;
    }
}