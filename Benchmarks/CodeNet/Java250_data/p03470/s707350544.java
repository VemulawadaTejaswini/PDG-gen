import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int n = Integer.parseInt(sc.nextLine());
        Integer d[] = new Integer[n];

        int i = 0;
        while (sc.hasNext()) {
            int val = Integer.parseInt(sc.nextLine());
            d[i] = val;
            i++;
        }
        Arrays.sort(d, Comparator.reverseOrder());

        int nowSize = d[0];
        for (Integer size : d) {
            if (size < nowSize) {
                nowSize = size;
                count++;
            }
        }

        System.out.println(count);
    }
}