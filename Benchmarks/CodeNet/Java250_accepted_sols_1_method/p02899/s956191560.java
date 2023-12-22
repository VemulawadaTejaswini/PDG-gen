import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Az = new int[N];
        for (int i = 0; i < N; i++){
            Az[i] = sc.nextInt() - 1;
        }
        int[] order = new int[N];
        for (int i = 0; i < N; i++){
            order[Az[i]] = i;
        }

        for (int i = 0; i < N; i++){
            System.out.print((order[i]+1)+" ");
        }
        System.out.println();


    }
}