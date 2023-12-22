import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        List<String> S = new ArrayList<>();
        Map<String, Integer> R = new HashMap<String, Integer>();


        for (int i = 0; i < N; i++) {
            S.add(scanner.next());
        }

        for (String temp : S) {
            Integer count = R.get(temp);
            R.put(temp, (count == null) ? 1 : count + 1);
        }

        System.out.println(R.size());
    }
}
