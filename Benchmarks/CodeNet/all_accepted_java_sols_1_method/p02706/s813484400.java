import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int sum = 0;
 
        for(int i = 1; i <= M; i++) {
            sum += in.nextInt();
        }
        if(N < sum) {
            System.out.println(-1);
        } else {
            System.out.println(N-sum);
        }
    }
}