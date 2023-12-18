import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        for (int i = 0 ; i < 3 ; i++) {
            System.out.print(s[i]);
        }
        System.out.print("\n");
    }

}
