import java.util.Scanner;

public class ABCA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < K; i++) {
            s.append("ACL");
        }
        System.out.println(s.toString());
    }
}
