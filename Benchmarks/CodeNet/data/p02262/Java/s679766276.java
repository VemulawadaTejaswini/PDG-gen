import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    static int cnt;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        
        shellSort(a, n);
    }
    
    static void insertionSort(int[] a, int n, int g){
        
        for(int i = g; i < n; i++){
            int v = a[i];
            int j = i-g;
            while(j >= 0 && a[j] > v){
                a[j+g] = a[j];
                j = j-g;
                cnt++;
            }
            a[j+g] = v;
        }
    }
    
    static void shellSort(int[] a, int n){
        
        cnt = 0;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int j = 0;
        while((list.get(j)*3 +1) < a.length){
            list.add(list.get(j)*3 +1);
            j++;
        }
        Collections.reverse(list);
        Integer[] g = list.toArray(new Integer[list.size()]);
        int m = g.length;
        for(int i = 0; i < m; i++){
            insertionSort(a, n, g[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(m).append(System.lineSeparator());
        for(int i = 0; i < m; i++){
            sb.append(g[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1).append(System.lineSeparator());
        sb.append(cnt).append(System.lineSeparator());
        for(int i = 0; i < n; i++){
            sb.append(a[i]).append(System.lineSeparator());
        }
        
        System.out.print(sb);
    }
}
