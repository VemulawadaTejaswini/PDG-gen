import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String t = br.readLine();
        
        List<TreeSet<Integer>> table = new ArrayList<>(26);
        for(int i = 0; i < 26; i++){
            table.add(new TreeSet<>());
        }
        
        for(int i = 0; i < s.length(); i++){
            int k = s.charAt(i) - 'a';
            table.get(k).add(i);
            table.get(k).add(i + s.length());
        }
        
        long base = 0;
        int idx = -1;
        for(int i = 0; i < t.length(); i++){
            int k = t.charAt(i) - 'a';
            Integer j = table.get(k).higher(idx);
            if( j == null ){
                System.out.println(-1);
                return;
            }
            
            idx = j;
            if(idx >= s.length()){
                base += s.length();
                idx -= s.length();
            }
        }
        
        System.out.println(base + idx + 1);
        
    }
}
