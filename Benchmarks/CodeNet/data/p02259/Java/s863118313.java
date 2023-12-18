import java.util.*;

public class Main {
    public static void main(String[] args) {
        aldl_1_2_a();
    }

    static void aldl_1_2_a() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(sc.nextInt());
        }
        sc.close();
        int count = 0;
        for (int i = 0; i < data.size(); i++) {
            for (int j = data.size() - 1; j > i; j--) {
                int dataJ = data.get(j);
                int dataJ1 = data.get(j - 1);
                if (dataJ < dataJ1) {
                    data.set(j, dataJ1);
                    data.set(j - 1, dataJ);
                    count++;
                }
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
