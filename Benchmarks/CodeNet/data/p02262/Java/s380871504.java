//Shell sort

import java.util.*;
import java.lang.*;


public class Main {

    static int count;
    static int[] a;
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        //System.out.println("---");
        
        count = 0;
        int m = 0;
        ArrayList<Integer> g = new ArrayList<>();
        g.add(1);
        while (true) {
            int h = 3 * g.get(m) + 1;
            //System.out.println("h = " + h);
            
            if (h < n) {
                g.add(h);
            } else {
                break;
            }
            m++;
        }
        m++;
        System.out.println(m);
        for (int i = m - 1; i >= 0; i--) {
            System.out.print(g.get(i));
            if (i != 0) {
                System.out.print(' ');
            }
        }
        System.out.println();
        
        for (int i = m - 1; i >= 0; i--) {
            insertionSort(n, g.get(i));
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
    
    static void insertionSort(int n, int g) {
        for (int i = g; i < n; i++) {
            int v = a[i];
            int j = i - g;
            while (j >= 0 && a[j] > v) {
                a[j + g] = a[j];
                j = j - g;
                count++;
            }
            a[j + g] = v;
        }
        
    }
}
