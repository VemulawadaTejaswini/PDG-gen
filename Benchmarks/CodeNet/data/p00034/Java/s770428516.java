import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String S = sc.next();

            List<Integer> distance = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                distance.add(Integer.valueOf(S.split(",")[i]));
            }

            int vs = Integer.parseInt(S.split(",")[10]);
            int ve = Integer.parseInt(S.split(",")[11]);

            double h = (double)distance.stream().mapToInt(Integer::intValue).sum() / (vs + ve); // 0.1
            double d = vs * h; // 4

            double count = 0;
            for (int i = 0; i < 10; i++) {
                count += distance.get(i);

                if (count >= d) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}