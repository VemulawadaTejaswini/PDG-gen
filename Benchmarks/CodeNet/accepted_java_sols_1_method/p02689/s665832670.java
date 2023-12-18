import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        boolean[] top = new boolean[N];

        for(int i = 0 ; i < N ; i++){
            H[i] = sc.nextInt();
            top[i] = true;
        }
        
        for(int i = 0 ; i < M ; i++){
            int A = sc.nextInt() -1;
            int B = sc.nextInt() -1;
            
            if(H[A] <= H[B]){
                top[A] = false;
            }
            if(H[A] >= H[B]){
                top[B] = false;
            }
        }

        int ans = 0;
        for(int i = 0 ; i < N ; i++){
            if(top[i]){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
