import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        int T = in.nextInt();
        int S = in.nextInt();
        String answer = time(D, T, S);
        System.out.println(answer);
        in.close();
    }

    public static String time(int D, int T, int S) {
        String result;
        if (D / S > T) {
            result = "No";
        } else {
            result = "Yes";
        }
        return result;
    }
}
