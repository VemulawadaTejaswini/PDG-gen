import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans;
        if (N < 10) ans = N;
        else if (10 <= N && N < 100) ans = 9;
        else if (100 <= N && N < 1000) ans = 9 + (N - 99);
        else if (1000 <= N && N < 10000) ans = 909;
        else if (10000 <= N && N < 100000) ans = 909 + (N - 9999);
        else ans = 90909;
        System.out.println(ans);
    }
}
