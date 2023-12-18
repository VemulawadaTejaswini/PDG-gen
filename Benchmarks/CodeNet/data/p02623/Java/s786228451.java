import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        long Az[] = new long[N];
        long Bz[] = new long[M];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            Bz[i] = sc.nextInt();
        }
        int sum = 0; int times = 0;
        int a = 0; int b = 0;

        while (sum <= K){
//            System.out.println(a+" "+b);
            if ((a >= Az.length) && (b >= Bz.length)){
                times++;
                break;
            }
            if (a >= Az.length){
                sum += Bz[b];
                b++;
            }
            else if (b >= Bz.length){
                sum += Az[a];
                a++;
            } else if (Az[a] >= Bz[b]){
//                System.out.println("aa");
                sum += Bz[b];
                b++;
            } else {
//                System.out.println("bb");
                sum += Az[a];
                a++;
            }
            times++;
        }
        System.out.println(times-1);
    }
}