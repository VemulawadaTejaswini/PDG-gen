import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.split("");
        if (array[2].equals(array[3])){
            if (array[4].equals(array[5])){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }else {
            System.out.println("No");
        }

    }
}