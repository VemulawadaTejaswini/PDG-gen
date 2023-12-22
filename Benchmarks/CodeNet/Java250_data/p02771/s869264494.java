import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        int a = Integer.parseInt(ss[0]);
        int b = Integer.parseInt(ss[1]);
        int c = Integer.parseInt(ss[2]);
        if (a == b && a != c) {
            System.out.println("Yes");
        }
        else if (a == c && a != b) {
            System.out.println("Yes");
        }
        else if (b == c && a != b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}