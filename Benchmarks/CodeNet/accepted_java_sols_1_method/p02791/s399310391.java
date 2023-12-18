import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int P[] = new int[N];
        for(int i=0; i<N; i++){
            P[i] = scanner.nextInt();
        }

        int min = N + 1;
        int count = 0;
        for(int i=0; i<N; i++){
            if(P[i] <= min){
                count ++;
                min = P[i];
            }
        }
        System.out.println(count);
    }
}