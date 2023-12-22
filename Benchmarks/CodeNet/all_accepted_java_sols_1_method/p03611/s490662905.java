import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        ArrayList<Integer> na = new ArrayList<>();
        for(int i=0; i<a.size(); i++) {
            na.add(a.get(i)+1);
            na.add(a.get(i)-1);
            na.add(a.get(i));
        }

        Map<Integer,Integer> m = new HashMap<>();
        for(int i: na) {
            if(m.containsKey(i)) {
                m.put(i, m.get(i)+1);
            } else {
                m.put(i, 1);
            }
        }

        int ans = 0;
        for(int i: m.keySet()) {
            ans = Math.max(ans, m.get(i));
        }
        System.out.println(ans);
    }
}
