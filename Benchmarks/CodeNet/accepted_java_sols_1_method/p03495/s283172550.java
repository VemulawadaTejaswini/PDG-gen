import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int cnt = 0;

        int n = scan.nextInt();
        int k = scan.nextInt();
        
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            int a = scan.nextInt();
            if(m.containsKey(a)){
                int v = m.get(a);
                m.put(a, ++v);
            }else{
                m.put(a, 1);
            }
        }
        List<Integer> list = new ArrayList<>(m.values());
        Collections.sort(list);
            
        for(int i=0; i<list.size()-k; i++){
            cnt += list.get(i);
        }
        
        scan.close();
        System.out.println(cnt);
    }
}