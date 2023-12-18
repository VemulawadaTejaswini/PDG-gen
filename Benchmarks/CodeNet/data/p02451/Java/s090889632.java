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

        int num_query = sc.nextInt();

        for (int i = 0; i < num_query; i++) {
            int key = sc.nextInt();
            if (Collections.binarySearch(array, key) < 0) sb.append(0).append("\n");
            else sb.append(1).append("\n");
        }

        System.out.print(sb);
        
        sc.close();
    }

    public static int binarySearch(List<Integer> list, int key) {
        int lower = 0;
        int middle = -1;
        int upper = list.size();

        while (upper > lower + 1) {
            middle = lower + (upper - lower) / 2;
            if (list.get(middle) > key) upper = middle;
            else lower = middle;
        }

        return upper;
    }
}

