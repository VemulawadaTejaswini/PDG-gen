import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            HashMap<Character, Character> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(sc.next().charAt(0), sc.next().charAt(0));
            }
            int m = sc.nextInt();
            char[] arr = new char[m];
            for (int i = 0; i < m; i++) {
                char c = sc.next().charAt(0);
                if (map.containsKey(c)) {
                    arr[i] = map.get(c);
                } else {
                    arr[i] = c;
                }
            }
            sb.append(new String(arr)).append("\n");
        }
        System.out.print(sb);
    }
}

