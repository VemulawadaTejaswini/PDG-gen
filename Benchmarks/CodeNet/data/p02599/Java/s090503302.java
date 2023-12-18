import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;

public class Main {
    static ArrayList<Integer>[] arr;
    static int a[], next[];
    static HashMap<Integer,Integer> m;

    static void merge(int ind){
        int lch = 2*ind+1, rch = 2*ind+2;
        int len1 = arr[lch].size();
        int len2 = arr[rch].size();
        int ind1 = 0, ind2 = 0;
        while(ind1 < len1 && ind2 < len2){
            if(arr[lch].get(ind1) < arr[rch].get(ind2)){
                arr[ind].add(arr[lch].get(ind1++));
            }else{
                arr[ind].add(arr[rch].get(ind2++));
            }
        }
        while(ind1 < len1){
            arr[ind].add(arr[lch].get(ind1++));
        }
        while(ind2 < len2){
            arr[ind].add(arr[rch].get(ind2++));
        }
    }

    static void build(int l, int r, int ind){
        if(l == r){
            arr[ind].add(next[l]);
            return;
        }
        int mid = (l+r)/2;
        build(l, mid, 2*ind+1);
        build(mid+1, r, 2*ind+2);
        merge(ind);
        return;
    }

    static int query(int a, int b, int l, int r, int ind){
        if(b < l || r < a){
            return 0;
        }
        if(a <= l && r <= b){
            int x = Collections.binarySearch(arr[ind], b);
            if(x < 0)   x = ~x;
            else        x++;
//            for(int s : arr[ind])   System.out.print(s + " ");
//            System.out.println();
//            System.out.println("l : " + l + "\t r : " + r  + "\t num : " + (arr[ind].size()-x));
            return arr[ind].size() - x;
        }
        int lch = query(a, b, l, (l+r)/2, 2*ind+1);
        int rch = query(a, b, (l+r)/2+1, r, 2*ind+2);
        return lch+rch;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int q = Integer.parseInt(line[1]);
        line = br.readLine().split(" ");
        a = new int[n];
        next = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(line[i])-1;
            next[i] = n;
        }
        m = new HashMap<Integer,Integer>();
        for(int i = n-1; i >= 0; i--){
            if(m.containsKey(a[i])){
                next[i] = m.get(a[i]);
            }
            m.put(a[i], i);
        }
        arr = new ArrayList[4*n];
        for(int i = 0; i < 4*n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        build(0, n-1, 0);
        for(int i = 0; i < q; i++){
            line = br.readLine().split(" ");
            int l = Integer.parseInt(line[0]);
            int r = Integer.parseInt(line[1]);
            System.out.println(query(--l, --r, 0, n-1, 0));
        }
    }
}
