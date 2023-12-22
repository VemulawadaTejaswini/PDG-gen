import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] t = new int[N + 1];
        int[] x = new int[N + 1];
        int[] y = new int[N + 1];

        t[0] = 0;
        x[0] = 0;
        y[0] = 0;
        for(int i=1; i<=N; i++){
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            int r = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
            int T = t[i] - t[i - 1];
            if(r > T){
                System.out.println("No");
                break;
            }
            else if(r < T){
                T = T - r;
                if(T%2!=0){
                    System.out.println("No");
                    break;
                }
            }
            if(i==N){
                System.out.println("Yes");
            }
        }

    }
}