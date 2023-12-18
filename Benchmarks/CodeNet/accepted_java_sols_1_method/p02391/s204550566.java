import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String conpare;
        if (a < b) {
            conpare = " < ";
        } else if (a > b) {
            conpare = " > ";
        } else {
            conpare = " == ";
        }

        System.out.println("a" + conpare + "b");
    }
}
