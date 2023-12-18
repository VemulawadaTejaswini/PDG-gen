import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[n];

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            set.add(array[i]);
        }

        if (set.size() == 1 && array.length > 1) {
            System.out.println(0);
            return;
        }

        start : for (int i = 0; i < n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (array[i] % list.get(j) == 0) {
                    continue start;
                }
            }

            list.add(array[i]);

        }

        System.out.println(list.size());

        sc.close();
    }

}