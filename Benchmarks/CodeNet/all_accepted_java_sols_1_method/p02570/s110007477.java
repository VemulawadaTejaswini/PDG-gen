import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int s = Integer.parseInt(sc.next());
        int distance = t * s;
        if (distance >= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}