import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        Set<String> sets = new HashSet<>();
        for (int i = 0; i < n; i++) {
            sets.add(s[i]);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String set : sets) {
            map.put(set, 0);
        }
        for (int i = 0; i < n; i++) {
            map.put(s[i], map.get(s[i])+1);
        }
        Set<String> results = new HashSet<>();
        int max = map.get(s[0]);
        results.add(s[0]);
        for (int i = 1; i < n; i++) {
            if (map.get(s[i]) > max) {
                max = map.get(s[i]);
                results.clear();
                results.add(s[i]);
            } else if (map.get(s[i]) == max) {
                results.add(s[i]);
            }
        }
        List<String> list = new ArrayList<>();
        for (String result : results) {
            list.add(result);
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
    }
}