import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haiku = sc.nextLine();

        System.out.println(haiku.replaceAll(",", " "));
    }
}
