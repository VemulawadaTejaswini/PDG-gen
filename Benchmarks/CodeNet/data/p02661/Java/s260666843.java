import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i]= sc.nextInt();
            B[i]= sc.nextInt();
        }


        Arrays.sort(A);
        Arrays.sort(B);

        if(N%2==1){
            int min = A[N/2];
            int max = B[N/2];
            System.out.println(max-min+1);
        }else{
            int min2 = (A[N/2-1]+A[N/2])/2;
            int max2 = (B[N/2-1]+B[N/2])/2;
            System.out.println((max2-min2)*2+1);
        }
    }



}