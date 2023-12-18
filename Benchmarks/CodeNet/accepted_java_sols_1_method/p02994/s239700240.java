import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();

        int sum = 0;
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int value = l + i;
            sum += value;
            values.add(value);
        }
        values.sort(Comparator.comparingInt(Math::abs));

        System.out.println(sum - values.get(0));
    }
}