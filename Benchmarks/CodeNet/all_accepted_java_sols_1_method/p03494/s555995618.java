import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A[] = new int[N];
        int count = 0;

        boolean end_flag = true;

        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(sc.next());
        }

        while(end_flag) {
            for (int i = 0; i < N; i++) {
                if ((A[i] & 1) == 0) {
                    A[i] = A[i] >> 1;
                }
                else {
                    end_flag = false;
                }
            }
            count++;
        }
        System.out.println(count-1);
    }
}
