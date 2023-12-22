import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        String result = (((a == b) && (a != c)) || ((a == c) && (a != b)) || ((b == c) && (a != b))) ? "Yes" : "No";

        System.out.println(result);

        sc.close();
    }
}
