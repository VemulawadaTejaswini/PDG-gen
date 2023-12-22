import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Integer x = Integer.parseInt(line);
        System.out.println((x * x * x));
    }
}