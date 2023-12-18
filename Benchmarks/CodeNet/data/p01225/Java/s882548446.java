import java.util.*;

public class Main {
    static HashMap<Integer, int[]> map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = permutation9();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] num = new int[9];
            int[] color = new int[9];
            for (int j = 0; j < 9; j++)
                num[j] = sc.nextInt();
            for (int j = 0; j < 9; j++) {
                String s = sc.next();
                if (s.equals("R")) color[j] = 0;
                else if (s.equals("G")) color[j] = 1;
                else if (s.equals("B")) color[j] = 2;
            }
            System.out.println(check(num, color));
        }
    }

    public static int check(int[] num, int[] color) {
        for (int key : map.keySet()) {
            int[] li = map.get(key);
            for (int m = 0; m < 3; m++) {
                if (color[li[3 * m + 0]] == color[li[3 * m + 1]] && color[li[3 * m + 0]] == color[li[3 * m + 2]]) {
                    if ((num[li[3 * m + 0]] == num[li[3 * m + 1]] && num[li[3 * m + 0]] == num[li[3 * m + 2]])
                            || (num[li[3 * m + 0]] == 1 + num[li[3 * m + 1]] && num[li[3 * m + 0]] == 2 + num[li[3 * m + 2]])
                            || (num[li[3 * m + 0]] == 2 + num[li[3 * m + 1]] && num[li[3 * m + 0]] == 1 + num[li[3 * m + 2]])
                            || (num[li[3 * m + 0]] == 1 + num[li[3 * m + 1]] && num[li[3 * m + 0]] == -1 + num[li[3 * m + 2]])
                            || (num[li[3 * m + 0]] == -1 + num[li[3 * m + 1]] && num[li[3 * m + 0]] == 1 + num[li[3 * m + 2]])
                            || (num[li[3 * m + 0]] == -2 + num[li[3 * m + 1]] && num[li[3 * m + 0]] == -1 + num[li[3 * m + 2]])
                            || (num[li[3 * m + 0]] == -1 + num[li[3 * m + 1]] && num[li[3 * m + 0]] == -2 + num[li[3 * m + 2]])) {
                        if(m!=2)continue;
                        return 1;
                    }
                    else break;
                }
                else break;
            }

        }
        return 0;
    }

    public static HashMap<Integer, int[]> permutation9() {
        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        Queue<int[]> que = new ArrayDeque<int[]>();
        HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
        que.add(a);
        map.put(getkey(a), a);
        while (que.isEmpty() == false) {
            int[] tt = que.remove();
            for (int i = 0; i < 9; i++) {
                for (int j = i + 1; j < 9; j++) {
                    int[] t = tt.clone();
                    int b = t[i] + 0;
                    t[i] = t[j] + 0;
                    t[j] = b;
                    int key = getkey(t);
                    if (!map.containsKey(key)) {
                        que.add(t);
                        map.put(key, t);
                    }
                }
            }
        }
        return map;
    }

    public static int getkey(int[] a) {
        int key = 0, b = 1;
        for (int i = 0; i < 9; i++) {
            key += a[i] * b;
            b *= 10;
        }
        return key;
    }
}
