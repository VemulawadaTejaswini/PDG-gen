import java.util.Scanner;

public class Main {
    Double A,B,N;

    public Main() {
        Scanner scanner = new Scanner(System.in);
        A = Double.parseDouble(scanner.next());
        B = Double.parseDouble(scanner.next());
        N = Double.parseDouble(scanner.next());

        double x = Math.min(B-1, N);
        int max = (int)(Math.floor(A*x/B)-A*Math.floor(x/B));
        System.out.println(max);
    }

    public static void main(String[] args) {
        new Main();
    }
}