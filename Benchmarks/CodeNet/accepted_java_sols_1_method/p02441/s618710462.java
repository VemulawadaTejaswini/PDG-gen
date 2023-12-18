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
            int left = sc.nextInt();
            int right = sc.nextInt();
            int key = sc.nextInt();

            int cnt = 0;
            for (int j = left; j < right; j++) {
                if (array.get(j) == key) cnt++;
            }
            sb.append(String.format("%d\n", cnt));
        }

        System.out.print(sb);
        
        sc.close();
    }
}

