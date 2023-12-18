import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer A[]= new Integer[N];
        int sum = 0;
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            sum += A[i];
        }
        Arrays.sort(A,Collections.reverseOrder());
        int b = A[M-1]*4*M;
        if(b<sum){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}