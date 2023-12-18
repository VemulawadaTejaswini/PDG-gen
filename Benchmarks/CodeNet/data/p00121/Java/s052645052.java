import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            ArrayList<int[]> li = new ArrayList<>();
            int[] a = new int[10];//8は階層、9は0の位置
            int cur = 0;
            a[9] = 0;

            for (int i = 0; i < 8; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) a[9] = i;
            }
            li.add(a.clone());
            if (!(check_end(li.get(cur)))) {
                while (true) {
                    //left
                    if (li.get(cur)[9] != 0 && li.get(cur)[9] != 4) {
                        for (int m = 0; m < 10; m++) {
                            a[m] = li.get(cur)[m];
                        }
                        a[a[9]] = a[a[9] - 1];
                        a[a[9] - 1] = 0;
                        a[9] -= 1;
                        a[8]++;
                        if (check_end(a)) break;
                        li.add(a.clone());
                    }
                    //right
                    if (li.get(cur)[9] != 3 && li.get(cur)[9] != 7) {
                        for (int m = 0; m < 10; m++) {
                            a[m] = li.get(cur)[m];
                        }
                        a[a[9]] = a[a[9] + 1];
                        a[a[9] + 1] = 0;
                        a[9] += 1;
                        a[8]++;
                        if (check_end(a)) break;
                        li.add(a.clone());
                    }
                    //up
                    if (li.get(cur)[9] > 3) {
                        for (int m = 0; m < 10; m++) {
                            a[m] = li.get(cur)[m];
                        }
                        a[a[9]] = a[a[9] - 4];
                        a[a[9] - 4] = 0;
                        a[9] -= 4;
                        a[8]++;
                        if (check_end(a)) break;
                        li.add(a.clone());
                    }
                    //down
                    if (li.get(cur)[9] < 4) {
                        for (int m = 0; m < 10; m++) {
                            a[m] = li.get(cur)[m];
                        }
                        a[a[9]] = a[a[9] + 4];
                        a[a[9] + 4] = 0;
                        a[9] += 4;
                        a[8]++;
                        if (check_end(a)) break;
                        li.add(a.clone());
                    }
                    cur++;
                }
            }
            System.out.println(a[8]);
        }
    }

    public static boolean check_end(int[] a) {
        for (int i = 0; i < 8; i++) {
            if (a[i] != i) return false;
        }
        return true;
    }

}
