import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for(int i=0; i<N; i++){
            int tmp = scanner.nextInt();
            A[i] = tmp;
            B[i] = tmp;
        }

        Arrays.sort(A);

        int first = A[N-1];
        int second = A[N-2];

        for(int i=0; i<N; i++){
            if(B[i] == first){
                System.out.println(second);
            }else{
                System.out.println(first);
            }
        }
    }
}
