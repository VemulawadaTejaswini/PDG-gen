import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        if(inputString.contains("A") && inputString.contains("B")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
