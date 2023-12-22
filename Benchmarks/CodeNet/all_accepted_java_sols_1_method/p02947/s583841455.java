import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> s = new ArrayList<>();

        HashMap<String, Long> strMap = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            String[] temp = sc.nextLine().split("");
            Arrays.sort(temp);
            s.add(String.join("", temp));

            if(strMap.containsKey(s.get(i))){
                strMap.put(s.get(i), strMap.get(s.get(i)) + 1);
            } else {
                strMap.put(s.get(i), Long.parseLong("1"));
            }
        }

        for(String key : strMap.keySet()){
            long l = strMap.get(key);
            ans += l * (l - 1) / 2;
        }

        System.out.println(ans);
        return;
    }
}
