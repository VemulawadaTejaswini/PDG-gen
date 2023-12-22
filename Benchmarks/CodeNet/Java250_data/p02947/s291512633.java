import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        List<String> list = new ArrayList<String>();
        for(long i = 0; i < n; i++){
            String s = sc.next();
            char temp[] = s.toCharArray();
            Arrays.sort(temp);
            list.add(new String(temp));
        }
        Collections.sort(list);


        Map<String, Long> map = new HashMap<String, Long>();
        for(String s : list) {
            if(map.containsKey(s)) {
                map.put(s, (map.get(s)+1));
            } else {
                map.put(s, 1L);
            }
        }

        long sum = 0;
        for(long c : map.values()) {
            // System.out.println("c="+c);
            for(long i = c - 1; i > 0; i--) {
                sum += i;
                // System.out.println("sum="+sum);
            }
        }

        // System.out.println(map.toString());
        System.out.println(sum);

    }
}
