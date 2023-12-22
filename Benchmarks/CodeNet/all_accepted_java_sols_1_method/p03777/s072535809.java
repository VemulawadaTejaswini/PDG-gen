import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array = input.split(" ");

        if(array[0].equals(array[1])) {
            System.out.println("H");
        } else {
            System.out.println("D");
        }
    }
}
