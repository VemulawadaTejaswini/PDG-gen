import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int[] n = new int[9];
            char[] list = sc.nextLine().toCharArray();
            for (int i : list) {
                n[i - '1']++;
            }
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < 9; i++) {
                next: for (int j = 0; j < 9; j++) {
                    if (n[i] < 4 && (n[j] >= 2 || n[i] >= 1)) {
                        int[] temp = n.clone();
                        temp[i]++;
                        temp[j] -= 2;
                        for (int k = 0; k < 7; k++) {
                            process(temp, k, 1);
                            process(temp, k, 2);
                            if (temp[k] % 3 != 0) {
                                continue next;
                            }
                        }
                        if (temp[7] % 3 == 0) {
                            result.add(i + 1);
                            break;
                        }
                    }
                }
            }
            if (result.isEmpty()) {
                System.out.println(0);
            } else {
                for (int i = 0; i < result.size(); i++) {
                    System.out.print(result.get(i) + (i < result.size() - 1 ? " " : "\n"));
                }
            }
        }
    }

    static void process(int[] a, int p, int n) {
        if (a[p] % 3 == n && a[p + 1] >= n && a[p + 2] >= n) {
            a[p] -= n;
            a[p + 1] -= n;
            a[p + 2] -= n;
        }
    }
}
