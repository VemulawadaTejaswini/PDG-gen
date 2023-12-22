import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println(new Scanner(System.in).nextLine().replace("1", "T").replace("9", "1").replace("T", "9"));
    }
}
