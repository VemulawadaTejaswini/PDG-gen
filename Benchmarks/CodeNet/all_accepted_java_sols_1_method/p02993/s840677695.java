import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();

        if(text.charAt(0) == text.charAt(1) || text.charAt(1) == text.charAt(2) || text.charAt(2) == text.charAt(3)){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
    }
}