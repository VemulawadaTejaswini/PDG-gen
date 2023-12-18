// editorial
import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;

class BIT{
    int n;
    int a[];
    BIT(int n){
        this.n = n;
        a = new int[n+1];
    }
    void add(int i, int x){
        while(i <= n){
            a[i] += x;
            i += i&-i;
        }
    }
    int sum(int i){
        int ret = 0;
        while(i > 0){
            ret += a[i];
            i -= i&-i;
        }
        return ret;
    }
}

class Pair implements Comparable<Pair>{
    int l, r, ind;
    Pair(int l, int r, int i){
        this.l = l;
        this.r = r;
        this.ind = i;
    }

    @Override
    public int compareTo(Pair p){
        return this.r-p.r;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int q = Integer.parseInt(line[1]);
        line = br.readLine().split(" ");
        int a[] = new int[n];
        for(int i = 0; i < n; i++)  a[i] = Integer.parseInt(line[i]);
        ArrayList<Pair> arr = new ArrayList<Pair>(q);
        for(int i = 0; i < q; i++){
            line = br.readLine().split(" ");
            arr.add(new Pair(Integer.parseInt(line[0])-1, Integer.parseInt(line[1])-1, i));
        }
        arr.sort(null);
        int ans[] = new int[q];
        BIT bit = new BIT(n);
        HashMap<Integer,Integer> last = new HashMap<Integer,Integer>();
        int qind = 0;
        for(int i = 0; i < n; i++){
            if(last.containsKey(a[i])){
                bit.add(last.get(a[i])+1, -1);
            }
            last.put(a[i], i);
            bit.add(last.get(a[i])+1, 1);
            while(qind < q && arr.get(qind).r==i){
                ans[arr.get(qind).ind] = bit.sum(i+1)-bit.sum(arr.get(qind).l);
                qind++;
            }
        }

        for(int x : ans)    System.out.println(x);
    }
}
