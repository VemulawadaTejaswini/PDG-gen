import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] chars = sc.nextLine().split(" ");
        sc.close();

        System.out.println(chars[1] + chars[0]);
    }

}