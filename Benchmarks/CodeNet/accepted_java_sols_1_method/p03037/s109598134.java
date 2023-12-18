import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];

        for(int i = 0; i < M; i++){
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        int maxL = L[0];
        int minR = R[0];

        for(int i = 0; i < M; i++){
            if(maxL < L[i])
                maxL = L[i];
            if(minR > R[i])
                minR = R[i];
        }
        
        if(minR - maxL + 1 > N){
            System.out.println(N);
        }else if(minR - maxL + 1 <= 0){
            System.out.println("0");
        }else{
            System.out.println(minR - maxL + 1);
        }


    }
}