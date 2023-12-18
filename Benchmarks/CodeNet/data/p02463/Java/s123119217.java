import java.util.*;
// import java.io.*;
// import java.time.*;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sb = new StringBuilder();

        int n = sc.nextInt();

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }

        while (!set.isEmpty()) {
            sb.append(set.pollFirst()).append("\n");
        }

        System.out.print(sb);
        
        sc.close();
    }
}

