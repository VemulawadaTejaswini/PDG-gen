import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, N;
        int Case[];
        Case = new int[10];
        for(i = 1; i < 100 ; i++) {
            int x = sc.nextInt();
            N = i;
            Case[i] = x;
            if(x == 0) break;
        }
        for(i = 1; i < N; i++) {
            System.out.println("Case " + i + ": " + Case[i]);
        }
    }
}
