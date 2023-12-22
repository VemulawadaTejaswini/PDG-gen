import java.util.Scanner;

public class Main {
    public static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        System.out.println(to_hop(N) + to_hop(M));
    }
    public static int to_hop(int temp)
    {
         return (temp*(temp-1)) / 2;

    }

}
