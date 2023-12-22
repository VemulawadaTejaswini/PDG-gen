import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long[] p = new long[a];
        long[] q = new long[b];
        long[] r = new long[c];
        long[] P = new long[x];
        long[] Q = new long[y];
        for (int i = 0; i < a; i++) {
            p[i] = sc.nextLong();
        }
        for (int i = 0; i < b; i++) {
            q[i] = sc.nextLong();
        }
        for (int i = 0; i < c; i++) {
            r[i] = sc.nextLong();
        }

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        long sumP = 0;
        long sumQ = 0;
        int point1 = 0;
        for (int i = a - 1; i >= a - x; i--) {
            sumP += p[i];
            P[point1++] = p[i];
        }
        point1 = 0;
        for (int i = b - 1; i >= b - y; i--) {
            sumQ += q[i];
            Q[point1++] = q[i];
        }

        long res = sumP + sumQ;
        int pointP = x - 1;
        int pointQ = y - 1;
        for (int i = c - 1; i >= 0; i--) {
            long large = r[i];
                //System.out.println(large);
            if (pointP >= 0 && pointQ >=0) {
                long pp = P[pointP];
                long qq = Q[pointQ];
      //System.out.println(pp);
              //System.out.println(qq);

                if (pp > qq) {
                    long diff = large - qq;
                    if (diff > 0) {
                        pointQ--;
                        res += diff;
                    } else {
                        break;
                    }
                } else {
                    long diff = large - pp;
                    if (diff > 0) {
                        pointP--;
                        res += diff;
                    } else {
                        break;
                    }
                }
            } else if (pointP >= 0) {
                long pp = P[pointP];
                long diff = large - pp;
                if (diff > 0) {
                    pointP--;
                    res += diff;
                } else {
                    break;
                }
            } else if (pointQ >= 0) {
                long pp = Q[pointQ];
                long diff = large - pp;
                if (diff > 0) {
                    pointQ--;
                    res += diff;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        System.out.println(res);
    }
}
