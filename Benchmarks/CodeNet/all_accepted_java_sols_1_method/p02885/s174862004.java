import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int R = A - 2*B;
        if(R < 0) {
            System.out.println("0");
        } else {
            System.out.println(R);
        }
    }


}
