import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();

        int D = 0;
        int tmp = 0;
        int[] arrA = new int[N];
        int cnt = 0;

        for(int i = 0; i < K; i++) {
            D = sc.nextInt();
            for(int j = 0; j < D; j++) {
                tmp = sc.nextInt();
                tmp--;
                arrA[tmp]++;
            }
        }
        for(int i = 0; i < N; i++) {
            if(arrA[i] == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
