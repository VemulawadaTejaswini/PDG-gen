import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Long> m = new TreeMap<>();

        for (int i=0; i<n; i++){
            String st = sc.next();
            char[] c = st.toCharArray();
            Arrays.sort(c);
            st = new String(c);
//            System.out.println(st);
            if (m.containsKey(st)){
                m.put(st, m.get(st)+1);
            }else{
                m.put(st, 1L);
            }
        }
//        System.out.println(m);

        long ans = 0;

        for (Long v: m.values()){
            ans += v*(v-1)/2;
        }
        System.out.println(ans);
    }
}
