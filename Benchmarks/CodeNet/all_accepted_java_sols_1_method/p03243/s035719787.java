import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        System.out.print(111 * ((n-1) / 111 + 1));

    }

}