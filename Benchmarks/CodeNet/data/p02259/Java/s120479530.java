import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        

        int[] test;
        test = new int[N];

        int tmp;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            test[i] = sc.nextInt();
        }
        for (int s = 0; s < N-1; s++) {
            for (int j = s + 1; j < N; j++) {
                if (test[s] > test[j]) {
                    tmp = test[s];
                    test[s] = test[j];
                    test[j] = tmp;
                    cnt++;
                }
            }
        }
        for (int j = 0; j < N; j++) {
            System.out.print(test[j]);
            if(j<N-1){
                System.out.print(" ");
            }
            if(j==N-1){
                System.out.println("");
            }
        }
        System.out.println(cnt);

    }
}

