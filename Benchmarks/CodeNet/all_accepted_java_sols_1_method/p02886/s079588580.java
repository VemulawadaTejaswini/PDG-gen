import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];
        for(int i = 0; i < N; i++){
            d[i] = sc.nextInt();
        }
        
        int ans = 0;
        int i = 0;
        if(i < N - 1){
            for(i = 0; i < N; i++){
                for(int j = i + 1; j < N; j++){
                    ans += d[i] * d[j];
                }
            }
        }
        System.out.println(ans);
    }
}