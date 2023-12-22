import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }

        HashMap <String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(array[i])){
                int value = map.get(array[i]);
                map.put(array[i], value + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        int max = Collections.max(map.values());

        List<String> list = new ArrayList<String>();

        for (String key : map.keySet()) {
            if (map.get(key) == max){
                list.add(key);
            }
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
