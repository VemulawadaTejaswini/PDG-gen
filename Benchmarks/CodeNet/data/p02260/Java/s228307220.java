import java.util.*;

public class Main {
    public static void main(String[] args) {
        aldl_1_2_b();
    }

    static void aldl_1_2_b() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(sc.nextInt());
        }
        sc.close();
        int count = 0;

        for (int i = 0; i < data.size() - 1; i++) {
            int minIndex = -1;
            int min = data.get(i);
            for (int j = i+1; j < data.size(); j++) {
                if (data.get(j) < min) {
                    min = data.get(j);
                    minIndex = j;
                }
            }
            if (minIndex > 0) {
                data.set(minIndex, data.get(i));
                data.set(i, min);
                count++;
            }
        }
        for (int i = 0; i < data.size(); i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(data.get(i));
        }
        System.out.println();
        System.out.println(count);
    }
}
