import java.util.Scanner; 


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        int[] px = new int[101];
        int[] nx = new int[101];
        int[] dpx = new int[N];
        int[] dnx = new int[N];
        int cp = 0;
        int cn = 0;
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0 ; i < 101; i++) {
            px[i] = X + i;
            nx[i] = X - i;
            for (int j = 0; j < N; j++) {
                dpx[j] = px[i] - p[j];
                dnx[j] = nx[i] - p[j];
                if (dpx[j] == 0) {
                    cp = cp;
                } else {
                    cp = cp+1;
                }
                if (dnx[j] == 0) {
                    cn = cn;
                } else {
                    cn =cn + 1;
                }
            }
            if ( cp == N && cn == N) {
                System.out.println(Math.min(px[i],nx[i]));
                break;
            } else if (cp == N && cn != N){
                System.out.println(px[i]);
                break;
            } else if (cn == N && cp != N) {
                System.out.println(nx[i]);
                break;
            } else {
                cp = 0;
                cn = 0;
            }
        }
    }
}