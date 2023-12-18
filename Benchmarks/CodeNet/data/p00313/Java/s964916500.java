import java.util.*;

class Main{
    private void compute(){
        int i;
        int tmp = 0;
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int[] c = new int[N];

        for (i = 0; i < N; i ++ ) a[i] = b[i] = c[i] = 0;

        int X = sc.nextInt();
        for (i = 0; i < X; i++){
            tmp = sc.nextInt();
            a[tmp - 1] = 1;
        }
        int Y = sc.nextInt();
        for (i = 0; i < Y; i++){
            tmp = sc.nextInt();
            b[tmp - 1] = 1;
        }
        int Z = sc.nextInt();
        for (i = 0; i < Z; i++){
            tmp = sc.nextInt();
            c[tmp - 1] = 1;
        }
        for (i = 0; i < N; i ++){
            if ((a[i] != 1 && c[i] == 1) || (b[i] == 1 && c[i] == 1)){
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
    public static void main(String[] arg){
        new Main().compute();
    }
}
