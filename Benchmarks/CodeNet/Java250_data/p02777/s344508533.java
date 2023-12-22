import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        int firstInt = scanner.nextInt();
        int secondInt = scanner.nextInt();

        String decision = scanner.next();

        if(decision.equals(first)){
            System.out.println((firstInt - 1) + " " + secondInt);
        } else {
            System.out.println(firstInt + " " + (secondInt - 1));
        }
    }
}
