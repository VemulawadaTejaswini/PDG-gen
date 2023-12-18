import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a_b_c = sc.nextLine().split(" ");
        int a = Integer.parseInt(a_b_c[0]);
        int b = Integer.parseInt(a_b_c[1]);
        int c = Integer.parseInt(a_b_c[2]);
        if (a < b && b < c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
