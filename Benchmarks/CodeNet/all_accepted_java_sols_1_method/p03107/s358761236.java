import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] chars = s.next().toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (char c : chars) {
            list.add(Character.getNumericValue(c));
        }
        long i = list.stream()
                .filter(n -> n == 0)
                .count();
        System.out.println(Math.min(i, list.size() - i) * 2);
    }
}