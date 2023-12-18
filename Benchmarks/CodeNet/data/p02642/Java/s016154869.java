import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        var A = new int[N];
        for(int i=0; i<N; i++)
            A[i] = scanner.nextInt();

        var num = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(i == j) continue;
                if(A[i] % A[j] == 0)
                    break;
                num++;
            }
        }

        System.out.println(num);
    }
}