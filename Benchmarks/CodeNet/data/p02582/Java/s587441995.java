import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();

        if (n1.equals("RSR")) {
            System.out.println(1);
            return;
        }

        System.out.println(n1.chars().filter(c -> c == 'R').count());
    }
}
