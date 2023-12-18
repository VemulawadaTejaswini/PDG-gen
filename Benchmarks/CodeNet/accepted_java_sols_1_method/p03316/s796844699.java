import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < String.valueOf(N).length(); i++) {
            int a = Integer.parseInt(String.valueOf(N).substring(i, i + 1));
            count += a;
        }
        System.out.println(N % count == 0 ? "Yes" : "No");
    }
}