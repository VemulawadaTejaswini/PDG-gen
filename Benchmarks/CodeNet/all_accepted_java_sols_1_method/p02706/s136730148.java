import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int temp = 0;
        while (M > 0)
        {
            temp = sc.nextInt();
            N -= temp;
            M--;
        }
        System.out.println(N >=0 ? N : -1);
    }
}
