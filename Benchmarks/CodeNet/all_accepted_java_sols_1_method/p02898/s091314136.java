import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[]A = new int[N];
    
        int cou = 0;
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        if(A[i]>=K){
            cou++;
         }
}
        System.out.print(cou);
}
}