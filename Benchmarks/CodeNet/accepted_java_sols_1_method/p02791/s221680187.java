import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int max = 0;
        for(int i=0; i<N; i++){
            P[i] = sc.nextInt();
            max = Math.max(max, P[i]);
        }
        int min = max;
        int count = 0;

        for(int i=0; i<N; i++){
            if(P[i] <= min) {
                count++;
                min = P[i];
            }
        }
        System.out.println(count);
    }
}