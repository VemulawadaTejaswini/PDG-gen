import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer d[] = new Integer[N];
        for(int i = 0; i<N; i++){
            d[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j = 0; j < N-1; j++){
            for(int k = j+1; k < N; k++){
                sum = sum + d[k] * d[j];
            }
        }
        System.out.println(sum);
    }
}