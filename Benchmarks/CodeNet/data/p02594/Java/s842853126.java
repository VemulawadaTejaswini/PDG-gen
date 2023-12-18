import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        input.nextLine();
        if (X >= 30) {
            System.out.println("Yes");
        } else {System.out.println("No");
        }
    }
}