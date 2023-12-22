import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(),b = s.nextInt(),c = s.nextInt();
        if (a<b&&b<c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}