import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] all = sc.nextLine().split(" ");
        sc.close();

        String S = all[0];
        String T = all[1];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            result.append(S.charAt(i));
            result.append(T.charAt(i));
        }

        System.out.println(result.toString());
    }

}