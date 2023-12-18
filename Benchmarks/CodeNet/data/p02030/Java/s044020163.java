import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    private static java.io.PrintWriter out = new java.io.PrintWriter(System.out);

    private static void solve() {
        
        int n = input.nextInt();
        int m = input.nextInt();

        int[] a = arrayInput(n);
        int[] b = arrayInput(m);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int v : a) {
        map.put(v, 1); // the appear of element
        }
        for (int v : b) {
            if (map.containsKey(v)) {
                map.put(v, 2);   
            } else {
                map.put(v, 1);
            }
        }
        
        List<Integer> and = new ArrayList<>();
        List<Integer> or = new ArrayList<>(map.keySet());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 2) {
            and.add(entry.getKey());
        }
        }
        Collections.sort(and);
        Collections.sort(or);
        
        out.println(and.size() + " " + or.size());
        for (int v : and) {
        out.println(v);
        }
        for (int v : or) {
        out.println(v);
        }
    }

    public static void main(String[] args) {
        solve();
        out.flush();
    }
    

    private static int[] arrayInput(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        a[i] = input.nextInt();
        return a;
    }
}

