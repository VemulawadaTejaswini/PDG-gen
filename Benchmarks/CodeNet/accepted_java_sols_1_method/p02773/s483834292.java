import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String kuuhaku = sc.nextLine();
        
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
            String a = sc.nextLine();
            if(map.containsKey(a)) {
                map.replace(a, map.get(a)+1);
            }else {
                map.put(a, 0);
            }
        }
        
        int max = 0;
        
        for(int c1 : map.values()) {
            if(max < c1) {
                max = c1;
            }    
        }
        
        List<String> ans = new ArrayList<>();
        
        for(String c1 : map.keySet()) {
            if(map.get(c1) == max) {
                ans.add(c1);
            } 
        }
        
        Collections.sort(ans);
        for(String s : ans) {
            System.out.println(s);
        }
    }
}