import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        
        int res = 0;

        for (int i= n-1; i>=n-k; i--){
            res = res + l.get(i);
        }

        System.out.println(res);
    }
}