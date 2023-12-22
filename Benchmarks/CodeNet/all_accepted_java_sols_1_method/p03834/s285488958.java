import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] str = new String[3];
        str = s.split(",");
        for (int i = 0; i < 3; i++) {
            System.out.print(str[i]);
            System.out.print(" ");
        }
    }
}