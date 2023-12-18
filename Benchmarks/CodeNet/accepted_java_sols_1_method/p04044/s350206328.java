import java.util.*;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String A[] = new String [N];
        for(int i = 0;i < N;i++){
            A[i] = sc.next();
        }
        Arrays.sort(A);
        StringBuilder B = new StringBuilder();
        for(int i = 0;i < A.length;i++){
            B.append(A[i]);
        }
        System.out.println(B);
    }
}
