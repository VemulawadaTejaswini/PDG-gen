import java.util.*;
// import java.io.*;
// import java.time.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            array.add(sc.nextInt());
        }

        int query = sc.nextInt();

        for (int i = 0; i < query; i++) {
            int key = sc.nextInt();
            int tmp = BinarySearch(array, key);
            if (tmp < 0) sb.append(num).append("\n");
            else sb.append(tmp).append("\n");
        }

        System.out.print(sb);
        
        sc.close();
    }

    public static int BinarySearch(List<Integer> list, int key) {
        int lower = -1;
        int middle = -1;
        int upper = list.size();

        while (upper > lower + 1) {
            middle = lower + (upper - lower) / 2;
            if (list.get(middle) > key - 1) upper = middle;
            else lower = middle;
        }

        return upper;
    }
}

