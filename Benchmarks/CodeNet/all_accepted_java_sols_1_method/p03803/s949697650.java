import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        int cardA = Integer.parseInt(array[0]);
        int cardB = Integer.parseInt(array[1]);

        if(cardA == cardB) {
            System.out.println("Draw");
        } else if(cardA > cardB) {
            if(cardB == 1) {
                System.out.println("Bob");
            } else {
                System.out.println("Alice");
            }
        } else {
            if(cardA == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }    
        }
    }
}
