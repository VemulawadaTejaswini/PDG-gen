import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).nextLine().matches("^A{0,1}KIHA{0,1}BA{0,1}RA{0,1}$") ? "YES" : "NO");
    }
}
