import java.util.*;
// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int num = sc.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int tmp = sc.nextInt();
            array.add(tmp);
        }

        int num_query = sc.nextInt();

        for (int i = 0; i < num_query; i++) {
            int query_type = sc.nextInt();
            int left = sc.nextInt();
            int right = sc.nextInt();

            if (query_type == 0) {
                int tmp = Integer.MAX_VALUE;
                for (int j = left; j < right; j++) {
                    tmp = Math.min(tmp, array.get(j));
                }
                sb.append(String.format("%d\n", tmp));
            } else {
                int tmp = Integer.MIN_VALUE;
                for (int j = left; j < right; j++) {
                    tmp = Math.max(tmp, array.get(j));
                }
                sb.append(String.format("%d\n", tmp));
            }
        }

        System.out.print(sb);
        
        sc.close();
    }
}

