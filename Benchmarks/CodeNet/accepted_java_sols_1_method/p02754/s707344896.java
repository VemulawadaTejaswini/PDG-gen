import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        String[] line = cin.nextLine().split(" ");
        long N = Long.parseLong(line[0]);
        long A = Long.parseLong(line[1]);
        long B = Long.parseLong(line[2]);

        long ans = N/(A+B) * A + Math.min(A, N%(A+B));
        System.out.println(ans);
        cin.close();
    }
}