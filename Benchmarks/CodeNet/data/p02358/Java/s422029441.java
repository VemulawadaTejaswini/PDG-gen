import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x1 = new int[N];
        int[] y1 = new int[N];
        int[] x2 = new int[N];
        int[] y2 = new int[N];
        TreeSet<Integer> set_x = new TreeSet<Integer>();
        TreeSet<Integer> set_y = new TreeSet<Integer>();
        for (int i=0;i<N;i++) {
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
            set_x.add(x1[i]);
            set_y.add(y1[i]);
            set_x.add(x2[i]);
            set_y.add(y2[i]);
        }
        ArrayList<Integer> list_x = new ArrayList<Integer>(set_x);
        ArrayList<Integer> list_y = new ArrayList<Integer>(set_y);

        int[] x1_new = new int[N];
        int[] y1_new = new int[N];
        int[] x2_new = new int[N];
        int[] y2_new = new int[N];
        for (int i=0;i<N;i++) {
            x1_new[i] = Collections.binarySearch(list_x, x1[i]);
            y1_new[i] = Collections.binarySearch(list_y, y1[i]);
            x2_new[i] = Collections.binarySearch(list_x, x2[i]);
            y2_new[i] = Collections.binarySearch(list_y, y2[i]);
        }

        int H = list_y.size();
        int W = list_x.size();
        int[][] map = new int[H][W];
        for (int i=0;i<N;i++) {
            map[y1_new[i]][x1_new[i]]++;
            map[y1_new[i]][x2_new[i]]--;
            map[y2_new[i]][x1_new[i]]--;
            map[y2_new[i]][x2_new[i]]++;
        }
        int[][] ruiseki = new int[H][W];
        for (int i=0;i<H-1;i++) {
            for (int j=0;j<W-1;j++) {
                ruiseki[i+1][j+1] = map[i][j]+ruiseki[i][j+1]+ruiseki[i+1][j]-ruiseki[i][j];
            }
        }
        long ans = 0L;
        for (int i=1;i<H;i++) {
            for (int j=1;j<W;j++) {
                if (ruiseki[i][j]>0) {
                    long area = (long)(list_x.get(j)-list_x.get(j-1))*(list_y.get(i)-list_y.get(i-1));
                    ans+=area;
                }
            }
        }
        System.out.println(ans);
    }
}
