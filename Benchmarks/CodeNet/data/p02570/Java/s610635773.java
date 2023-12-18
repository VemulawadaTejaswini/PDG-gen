import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        int T = in.nextInt();
        int S = in.nextInt();
        String answer = time(D, T, S);
        System.out.println(answer);
    }

    public static String time(int D, int T, int S) {
        int t = D / S;
        String result = "";
        if (t > T) {
            result = "No";
        } else {
            result = "Yes";
        }
        return result;
    }
}
