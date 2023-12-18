import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ans = sc.next().replace('1', '5').replace('9', '1').replace('5', '9');

        System.out.println(ans);

        sc.close();
    }
}