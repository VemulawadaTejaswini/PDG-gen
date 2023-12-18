import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int x = list.remove(i);
            boolean inserted = false;
            for (int j = 0; j < i; j++) {
                if (list.get(j) >= x) {
                    list.add(j, x);
                    inserted = true;
                    break;
                }
            }
            if (!inserted) {
                list.add(i, x);
            }
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    sb.append(" ");
                }
                sb.append(list.get(j));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
