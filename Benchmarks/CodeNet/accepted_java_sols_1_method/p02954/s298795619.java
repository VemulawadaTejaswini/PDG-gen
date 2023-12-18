import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int f = 0, c = 0;
        Queue<Integer> que = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("R")) {
                if (f == 1) {
                    f = 0;
                    que.add(c);
                    c = 0;
                }
                c++;
            } else {
                if (f == 0) {
                    f = 1;
                    que.add(c);
                    c = 0;
                }
                c++;
                if (i == s.length() - 1) {
                    que.add(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (que.size() > 0) {
            int x = que.poll();
            int y = que.poll();
            if ((x + y) % 2 == 0) {
                for (int i = 0; i < x - 1; i++) {
                    sb.append("0 ");
                }
                sb.append((x + y) / 2);
                sb.append(" ");
                sb.append((x + y) / 2);
                sb.append(" ");
                for (int i = 0; i < y - 1; i++) {
                    sb.append("0 ");
                }
            } else if (x % 2 == 0) {
                for (int i = 0; i < x - 1; i++) {
                    sb.append("0 ");
                }
                sb.append((x + y) / 2);
                sb.append(" ");
                sb.append((x + y) / 2 + 1);
                sb.append(" ");
                for (int i = 0; i < y - 1; i++) {
                    sb.append("0 ");
                }
            } else {
                for (int i = 0; i < x - 1; i++) {
                    sb.append("0 ");
                }
                sb.append((x + y) / 2 + 1);
                sb.append(" ");
                sb.append((x + y) / 2);
                sb.append(" ");
                for (int i = 0; i < y - 1; i++) {
                    sb.append("0 ");
                }
            }
        }
        System.out.println(sb);
    }
}