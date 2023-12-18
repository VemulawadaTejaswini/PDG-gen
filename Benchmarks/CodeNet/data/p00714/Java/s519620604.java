import java.util.*;

public class Main {
    private static int H = 50, D = 30, W = 100;
    private static float SA = 0.0001f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for (int z = 0; z < d; z++) {
            int n = sc.nextInt();
            float[][] data = new float[n + 1][6];
            /*
            for (float[] a : data) {
                for (float b : a) {
                    b = 0;
                }
            }
            */
            data[0][0] = 0;
            data[0][1] = 50;
            data[n][2] = 100;
            data[n][3] = 50;
            for (int i = 1; i < n + 1; i++) {
                data[i][0] = sc.nextInt();
                data[i][1] = sc.nextInt();
                data[i - 1][2] = data[i][0];
                data[i - 1][3] = data[i][1];
            }
            int m = sc.nextInt();
            int[][] tap = new int[m][2];
            for (int i = 0; i < m; i++) {
                tap[i][0] = sc.nextInt();
                tap[i][1] = sc.nextInt();
            }


            List<Float> timelist = new ArrayList<>();
            List<float[][]> datalist = new ArrayList<>();
            timelist.add((float) 0);
            datalist.add(data);

            for (int y = 0; ; y++) {
                float[][] before = datalist.get(y);
                if (before.length == 1) break;
                for (int i = 0; i < m; i++) {//decide water from each tap
                    for (int j = 0; j < n + 1; j++) {
                        if (before[j][2] < tap[i][0]) continue;
                        while (Math.abs(before[j][4] - Math.min(before[j][1], before[j][3])) < SA) {
                            if (before[j][1] > before[j][3]) j += 1;
                            else j -= 1;
                        }
                        before[j][5] += tap[i][1];
                        break;
                    }
                }

                float min = 99999999;
                int num = 0;
                for (int i = 0; i < before.length; i++) {
                    if (before[i][5] != 0) {
                        float nexttime = (Math.min(before[i][1], before[i][3]) - before[i][4]) * (before[i][2] - before[i][0]) * D / before[i][5];
                        if (nexttime < min) {
                            min = nexttime;
                            num = i;
                        }
                    }
                }
                timelist.add(timelist.get(y) + min);

                float[][] after = new float[before.length][6];
                for (int i = 0; i < before.length; i++) {
                    /*
                                        for (int j = 0; j < 6; j++) {
                        after[i][j] = before[i][j] + 0;
                    }
                     */
                    after[i] = before[i].clone();
                    after[i][4] += (after[i][5] * min) / ((after[i][2] - after[i][0]) * D);
                }

                if (0 < num) {
                    if (Math.abs(after[num][4] - after[num - 1][4]) < SA) {
                        float[][] next = new float[before.length - 1][6];
                        int state = 0;
                        for (int i = 0; i < next.length; i++) {
                            if (i == num - 1) {
                                next[i][0] = after[i][0] + 0;
                                next[i][1] = after[i][1] + 0;
                                next[i][2] = after[i + 1][2] + 0;
                                next[i][3] = after[i + 1][3] + 0;
                                next[i][4] = after[i][4] + 0;
                                state = 1;
                            } else {
                                next[i] = after[i + state].clone();
                                next[i][5] = 0;
                            }
                        }
                        datalist.add(next);
                        continue;
                    }
                }
                if (num < after.length - 1) {
                    if (Math.abs(after[num][4] - after[num + 1][4]) < SA) {
                        float[][] next = new float[before.length - 1][6];
                        int state = 0;
                        for (int i = 0; i < next.length; i++) {
                            if (i == num) {
                                next[i][0] = after[i][0] + 0;
                                next[i][1] = after[i][1] + 0;
                                next[i][2] = after[i + 1][2] + 0;
                                next[i][3] = after[i + 1][3] + 0;
                                next[i][4] = after[i][4] + 0;
                                state = 1;
                            } else {
                                for (int j = 0; j < 6; j++) {
                                    if (j == 5) next[i][j] = 0;
                                    else next[i][j] = after[i + state][j] + 0;
                                }
                            }
                        }
                        datalist.add(next);
                        continue;
                    }
                }
                for (float[] a : after) {
                    a[5] = 0;
                }
                datalist.add(after);
            }

            int l = sc.nextInt();
            int[][] li = new int[l][2];
            for (int i = 0; i < l; i++) {
                li[i][0] = sc.nextInt();
                li[i][1] = sc.nextInt();
            }
            for(int i=0;i<l;i++){
                int j = 0;
                while (li[i][1] > timelist.get(j + 1)) {
                    j++;
                    if (!(j+1 < timelist.size())) break;
                }
                if (!(j+1 < timelist.size())) System.out.println(H);
                else {
                    float[][] re = datalist.get(j);
                    int k = 0;
                    while (li[i][0] > re[k][2]) k++;
                    System.out.println(re[k][4] + re[k][5] * (li[i][1] - timelist.get(j)) / (D * (re[k][2] - re[k][0])));
                }
            }
        }
    }
}

