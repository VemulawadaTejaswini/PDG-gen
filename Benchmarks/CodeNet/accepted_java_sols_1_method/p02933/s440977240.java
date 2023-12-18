import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        if (a >= 3200) {
            System.out.print(s);
        } else {
            System.out.print("red");
        }
    }
}