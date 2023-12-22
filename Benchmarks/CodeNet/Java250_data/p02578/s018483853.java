import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(new SolverC().solve(arr, N));
    }
}

class SolverC {
    public long solve(int[] arr, int N){
        long res = 0;
        for(int i=1;i<N;i++){
            if(arr[i] < arr[i-1]){
                int diff = arr[i-1] - arr[i];
                arr[i] += diff;
                res += diff;
            }
        }

        return res;
    }
}