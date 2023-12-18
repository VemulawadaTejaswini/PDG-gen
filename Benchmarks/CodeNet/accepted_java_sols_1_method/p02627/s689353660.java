import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(Character.isUpperCase(scanner.nextLine().charAt(0))){
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}