

import java.util.Scanner;

public class Main {

    static int[] p;
    static int[] x;
    static int[] y;
    static int[] size;
    static int[] sizes;

    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int q = Integer.parseInt(scanner.next());

        p = new int[n];
        x = new int[q];
        y = new int[q];
        size = new int[q];
        sizes = new int[n];



        for(int i = 0; i < n; i++){
            p[i] = i;
            sizes[i] = 0;
        }

        for(int i = 0; i < q; i++){
            x[i] = Integer.parseInt(scanner.next());
            y[i] = Integer.parseInt(scanner.next());
            size[i] = Integer.parseInt(scanner.next());
        }

        quick_sort(size, 0, q - 1);

        for(int i = 0; i < q; i++){
            unite(x[i], y[i], size[i]);
        }

        System.out.println(size(0));



    }

    static public int find(int x){
        if(x == p[x]) return x;
        return p[x] = find(p[x]);
    }

    static public void unite(int x, int y, int size){
        x = find(x);
        y = find(y);

        if(x == y) return;

        if(sizes[x] < sizes[y]){
            int tmp;
            tmp = x;
            x = y;
            y = tmp;
        }

        sizes[x] += size;

        p[y] = x;
        sizes[x] += sizes[y];
    }

    public static boolean same(int x, int y){
        if(find(x) == find(y)) return true;
        return false;
    }

    public static int size(int x){
        return sizes[find(x)];
    }


    public static void quick_sort(int[] d, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = d[(left + right) / 2];
        int l = left, r = right, tmp;
        while (l <= r) {
            while (d[l] < p) {
                l++;
            }
            while (d[r] > p) {
                r--;
            }
            if (l <= r) {
                tmp = d[l];
                d[l] = d[r];
                d[r] = tmp;
                tmp = x[l];
                x[l] = x[r];
                x[r] = tmp;
                tmp = y[l];
                y[l] = y[r];
                y[r] = tmp;
                l++;
                r--;
            }
        }
        quick_sort(d, left, r);
        quick_sort(d, l, right);
    }


}

