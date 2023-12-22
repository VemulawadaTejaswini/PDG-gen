import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().indexOf('7') != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}