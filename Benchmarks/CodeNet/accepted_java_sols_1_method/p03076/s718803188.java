import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int[] time = new int[5];
            for (int i = 0; i < time.length; i++) {
                time[i] = in.nextInt();
            }

            int min = (int) 1e9;
            boolean[] used = new boolean[5];
            for (int i = 0; i < time.length; i++) {
                used[i] = true;
                int t1 = time[i];
                while (t1 % 10 != 0) {
                    t1++;
                }
                for (int i2 = 0; i2 < time.length; i2++) {
                    if (used[i2]) {
                        continue;
                    }
                    used[i2] = true;
                    int t2 = t1 + time[i2];
                    while (t2 % 10 != 0) {
                        t2++;
                    }
                    for (int i3 = 0; i3 < time.length; i3++) {
                        if (used[i3]) {
                            continue;
                        }
                        used[i3] = true;
                        int t3 = t2 + time[i3];
                        while (t3 % 10 != 0) {
                            t3++;
                        }
                        for (int i4 = 0; i4 < time.length; i4++) {
                            if (used[i4]) {
                                continue;
                            }
                            used[i4] = true;
                            int t4 = t3 + time[i4];
                            while (t4 % 10 != 0) {
                                t4++;
                            }
                            for (int i5 = 0; i5 < time.length; i5++) {
                                if (used[i5]) {
                                    continue;
                                }
                                int t5 = t4 + time[i5];
                                if (t5 < min) {
                                    min = t5;
                                }
                            }
                            used[i4] = !true;
                        }
                        used[i3] = !true;
                    }
                    used[i2] = !true;
                }
                used[i] = !true;
            }
            System.out.println(min);
        }
    }
}
