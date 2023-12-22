import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> amount = new ArrayList<>();
        while (sc.hasNext()) {
            amount.add(sc.nextInt());
        }

        Collections.sort(amount);
        int result = amount.get(0) + amount.get(1);
        System.out.println(result);
    }
}
