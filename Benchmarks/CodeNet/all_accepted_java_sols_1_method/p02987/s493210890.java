import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.substring(i,i+1))) {
                map.put(S.substring(i,i+1), map.get(S.substring(i,i+1)) + 1);
            } else {
                map.put(S.substring(i,i+1), 1);
            }
        }
        String result = "No";
        if (map.size() == 2) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() != 2) {
                    break;
                }
                result = "Yes";
            }
        }
        System.out.println(result);
    }
}