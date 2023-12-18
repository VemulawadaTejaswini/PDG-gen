import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] s = new String[N];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            s[i] = sc.next();
            if(map.containsKey(s[i]))
                map.put(s[i], map.get(s[i]) + 1);
            else
                map.put(s[i], 1);
        }
        int M = sc.nextInt();
        String[] t = new String[M];
        for(int i = 0; i < M; i++){
            t[i] = sc.next();
            if(map.containsKey(t[i])){
                map.put(t[i], map.get(t[i]) - 1);
            }
        }
        sc.close();

        int max = 0;
        for(String key: map.keySet()){
            max = Math.max(max, map.get(key));
        }

        System.out.println(max);        
    }
}