import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = 'A';
        while (sc.hasNext()) {
            char[] list = sc.nextLine().toCharArray();
            char p1 = list[0];
            char p2 = list[2];
            if (p1 == a) {
                a = p2;
            } else if (p2 == a) {
                a = p1;
            }
        }
        System.out.println(a);
    }
}
