import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        c += 1;


        System.out.println(c);

    }

}
