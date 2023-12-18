import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextInt();
        if (Math.abs(c-a) <= d || (Math.abs(b-a) <= d && Math.abs(c-b) <= d))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
