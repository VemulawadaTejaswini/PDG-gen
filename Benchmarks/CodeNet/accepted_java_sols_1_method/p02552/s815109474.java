import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(Integer.parseInt(sc.next()) == 0 ? 1 : 0);
        }
    }

}