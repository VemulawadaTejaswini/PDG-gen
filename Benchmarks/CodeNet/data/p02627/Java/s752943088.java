import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
                String h = scan.nextLine();
                if(Character.isUpperCase(h.charAt(0))) {

                  System.out.println("A");
                } else {
                  System.out.println("a");
                }

    }
}
