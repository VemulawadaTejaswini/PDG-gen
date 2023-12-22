
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        int total=0;
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            total+=A[i];
        }
        Arrays.sort(A);
        if(A[N-M]*4*M>=total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}