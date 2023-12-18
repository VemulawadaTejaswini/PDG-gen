import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];
        for(int i = 0; i < N; i++){
            S[i] = sc.next();
        }
        sc.close();
        HashMap<String, Integer> mp = new HashMap<>();
        for(int i = 0; i < N; i++){
            mp.put(S[i], mp.getOrDefault(S[i], 0) + 1);
        }
        List<String> res = new ArrayList<>();
        int max_val = 0;
        for(Entry<String, Integer> e: mp.entrySet()){
            max_val = Math.max(max_val, e.getValue());
        }

        for(Entry<String, Integer> e: mp.entrySet()){
            if(max_val == e.getValue()){
                res.add(e.getKey());
            }
        }
        res.sort(Comparator.naturalOrder());
        for(String s: res){
            System.out.println(s);
        }




    }
}