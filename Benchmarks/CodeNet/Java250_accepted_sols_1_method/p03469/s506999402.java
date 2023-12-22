import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String firstThree = input.substring(0,3);
        String seven = input.substring(3,4);
        String rest = input.substring(4);
        seven = "8";
        System.out.println(firstThree+seven+rest);
    }
}
