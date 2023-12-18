import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0L;
        int n = sc.nextInt();
        Map<Integer, List<String>> lenMap = new TreeMap<Integer, List<String>>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(!lenMap.containsKey(s.length())) lenMap.put(s.length(), new ArrayList<>());
            lenMap.get(s.length()).add(s);
        }
        Map<String, List<String>> sufMap = new HashMap<>();
        for(List<String> list : lenMap.values()){
            for(String s : list){
                int len = s.length();
                for (int i = 0; i < len-1; i++) {
                    String suf = 0 < i ? s.substring(len-i) : "";
                    if(sufMap.containsKey(suf)){
                        for(String pre : sufMap.get(suf)){
                            if(s.substring(0, len-suf.length()).contains(pre)){
                                ans++;
                            }
                        }
                    }
                }
                String suf = 1 < len ? s.substring(1) : "";
                String pre = 1 < len ? s.substring(0, 1) : s;
                if(!sufMap.containsKey(suf)) sufMap.put(suf, new ArrayList<String>());
                sufMap.get(suf).add(pre);
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
