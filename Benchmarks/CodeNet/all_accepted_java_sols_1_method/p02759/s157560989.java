import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt( sc.nextLine() );

        System.out.println( n / 2 + ( n % 2 == 0 ? 0 : 1 ) );

    }

}
