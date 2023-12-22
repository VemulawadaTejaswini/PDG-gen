import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int A = Integer.parseInt(in[0]);
        int B = Integer.parseInt(in[1]);
        int C = Integer.parseInt(in[2]);
        int D = Integer.parseInt(in[3]);

        while (true) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                break;
            }

            A -= D;
            if (A <= 0) {
                System.out.println("No");
                break;
            }
        }
    }
}