
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int A[] = new int[Q];
        for(int i = 0; i < Q; i++){
        A[i] = sc.nextInt();
        }
        int person[] = new int[N];
        for(int i = 0; i < N; i++){
            person[i] = K - Q;
        }
        for(int i = 0; i < Q; i++){
            person[A[i]-1] ++;
        }
        for(int i = 0; i < N; i++){
            if(person[i] > 0){
                System.out.println("Yes");
            } else {
                System.out.println("No");

            }
        }





    }
}




