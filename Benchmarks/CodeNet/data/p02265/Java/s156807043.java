import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] cs = new String[n];
        long[] ns = new long[n];
        String[] elems;
        for (int i = 0; i < n; i++) {
            elems = sc.nextLine().split(" ");
            cs[i] = elems[0];
            if (cs[i].equals("insert") || cs[i].equals("delete"))
                ns[i] = Long.parseLong(elems[1]);
        }
        long[] ls = new long[n+1];
        int head = 1, last = 1;
        for (int i = 0; i < n; i++) {
            switch (cs[i]) {
                case "insert":
                    ls[last++] = ns[i];
                    break;
                case "delete":
                    int idx = last;
                    boolean flg = false;
                    while (--idx >= head && ls[idx] != ns[i]);
                    while (idx >= head) {
                        ls[idx] = ls[idx-1];
                        idx--;
                        flg = true;
                    }
                    if (flg)
                        head++;
                    break;
                case "deleteFirst":
                    last--;
                    break;
                case "deleteLast":
                    head++;
                    break;
                default:
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = last-1; i >= head; i--) {
            sb.append(ls[i] + " ");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}