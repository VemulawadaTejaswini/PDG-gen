import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        int max = -1000001;
        int min = 1000001;
        int maxi = 0;
        int mini = 0;

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
            if(max==A[i]){
                maxi = i + 1;
            }
            if(min==A[i]){
                mini = i + 1;
            }
        }
        
        if(min>=0){
            System.out.println(N - 1);
            for(int i=1; i<=N-1; i++){
                System.out.println(i + " " + (int)(i + 1));
            }
        }
        else{
            System.out.println(2 * N - 1);
            if(Math.abs(max)>=Math.abs(min)){
                for(int i=1; i<=N; i++){
                    System.out.println(maxi + " " + i);
                }
                for(int i=1; i<=N-1; i++){
                    System.out.println(i + " " + (int)(i + 1));
                }
            }
            else{
                for(int i=1; i<=N; i++){
                    System.out.println(mini + " " + i);
                }
                for(int i=N - 1; i>=1; i--){
                    System.out.println(i + 1 + " " + i);
                }
            }
        }
    }
}