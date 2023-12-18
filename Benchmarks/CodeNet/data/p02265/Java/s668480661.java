import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] cs = new String[n];
        int[] ns = new int[n];
        String[] elems;
        for (int i = 0; i < n; i++) {
            elems = sc.nextLine().split(" ");
            cs[i] = elems[0];
            if (cs[i].equals("insert") || cs[i].equals("delete"))
                ns[i] = Integer.parseInt(elems[1]);
        }
        int[] ls = new int[n];
        int head = 0, last = 0;
        for (int i = 0; i < n; i++) {
            switch (cs[i]) {
                case "insert":
                    ls[last++] = ns[i];
                    break;
                case "delete":
                    int idx = head;
                    while (idx < last && ls[idx++] != ns[i]);
                    while (idx < last) {
                        ls[idx-1] = ls[idx];
                        idx++;
                    }
                    last--;
                    break;
                case "deleteFirst":
                    head++;
                    break;
                case "deleteLast":
                    last--;
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