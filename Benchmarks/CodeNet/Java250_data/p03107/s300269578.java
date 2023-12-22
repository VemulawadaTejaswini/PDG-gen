import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] chars = s.next().toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for (char c : chars) {
            list.add(Character.getNumericValue(c));
        }

        int zero = 0;
        int one = 0;
        for (int num : list) {
            if (num == 0) zero++;
            else one++;
        }
        System.out.println(Math.min(zero, one) * 2);
    }
}