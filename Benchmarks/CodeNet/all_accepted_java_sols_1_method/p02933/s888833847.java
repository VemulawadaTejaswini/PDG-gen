import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String s = sc.next();

        System.out.println(3200 <= a ? s : "red");
    }
}
