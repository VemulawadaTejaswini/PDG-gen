import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();

        int canWatch = 2*D +1;

        int result = N / canWatch;

        if(N % canWatch != 0) result++;

        System.out.println(result);

    }
}
