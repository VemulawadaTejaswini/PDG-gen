import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        int max = 0;
        for(int i=0;i<n;i++){
            String s = sc.next();
           if(map.containsKey(s)){
               int t = map.get(s) + 1;
               map.put(s, t);
               max = Math.max(t, max);
           } else {
               map.put(s, 1);
               max = Math.max(max,1);
           }
        }

        for(Map.Entry<String, Integer> entry :map.entrySet()){
            if(entry.getValue().equals(max)){
                System.out.println(entry.getKey());

            }
        }
    }
}
