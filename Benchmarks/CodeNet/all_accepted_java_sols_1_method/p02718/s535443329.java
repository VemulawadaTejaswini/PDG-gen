import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum = sum + A[i];
        }
        Arrays.sort(A);
        double c = (double)sum/(4*M);
        if(A[N-M] < c){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
} 