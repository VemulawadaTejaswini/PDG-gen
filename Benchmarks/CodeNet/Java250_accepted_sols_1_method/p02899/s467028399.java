import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] O = new int[n + 1];
        for(int i = 1; i <= n; i++) O[Integer.parseInt(sc.next())] = i;
        for(int i = 1; i < n; i++) {
            sb.append(O[i]).append(" ");
        }
        System.out.println(sb.append(O[n]));
    }
}
