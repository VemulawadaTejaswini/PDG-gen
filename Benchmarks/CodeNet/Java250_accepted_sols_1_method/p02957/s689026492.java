import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt(), b = input.nextInt();
            int k = (a+b)/2;
            if((a%2) == (b%2))
                System.out.println(k);
            else
                System.out.println("IMPOSSIBLE");
        }
    }
}