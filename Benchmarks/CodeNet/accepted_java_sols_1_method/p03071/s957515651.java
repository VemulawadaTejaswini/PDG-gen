import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] abt = sc.nextLine().split(" ");
        int A = Integer.parseInt(abt[0]);
        int B = Integer.parseInt(abt[1]);

        int max = Math.max(A, B) * 2;
        if (A == B) {
            System.out.println(max);
        } else {
            System.out.println(max - 1);
        }
    }

}
