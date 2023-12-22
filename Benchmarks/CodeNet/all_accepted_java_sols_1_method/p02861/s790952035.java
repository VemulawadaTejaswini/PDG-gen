import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        //全2点間の距離を加算
        double sum = 0;
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                sum += Math.sqrt((x[i] - x[j])*(x[i] - x[j]) + (y[i] - y[j])*(y[i] - y[j]));
            }
        }

        //どの2点間に関しても、2(n-1)!回通る。
        //全通りはn!
        //sum*2(n-1)!/n!=sum*2/n;

        System.out.println(sum*2/N);
    }
}